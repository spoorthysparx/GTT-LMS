package com.hexaware.gtt.lms.servicesImpl;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.gtt.lms.dto.PointsAmountRequestDto;
import com.hexaware.gtt.lms.dto.PointsAmountResponseDto;
import com.hexaware.gtt.lms.dto.UserCouponRequestDto;
import com.hexaware.gtt.lms.dto.UserCouponResponseDto;
import com.hexaware.gtt.lms.dto.UserValidationDto;
import com.hexaware.gtt.lms.entities.Coupons;
import com.hexaware.gtt.lms.entities.Tiers;
import com.hexaware.gtt.lms.entities.UserCoupons;
import com.hexaware.gtt.lms.entities.Users;
import com.hexaware.gtt.lms.repositories.CouponRepository;
import com.hexaware.gtt.lms.repositories.TiersRepository;
import com.hexaware.gtt.lms.repositories.UserCouponRepository;
import com.hexaware.gtt.lms.repositories.UserRepository;
import com.hexaware.gtt.lms.services.TransactionService;
import com.hexaware.gtt.lms.services.UserCouponService;
@Service
public class TransactionServiceImpl implements TransactionService{

	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private TiersRepository tiersRepository;
	@Autowired
	private UserCouponRepository userCouponRepository;
	@Autowired
	private UserCouponService userCouponService;

	
	
	
	@Override
	public PointsAmountResponseDto finalAmount(PointsAmountRequestDto pointsAmountRequestDto) {
		UUID uId=userRepository.findUIdByPartnerIdAndUserId(pointsAmountRequestDto.getPartnerId(),pointsAmountRequestDto.getUserId());
		Users user=userRepository.findByUId(uId);
		Tiers tiers=tiersRepository.findById(user.getTiers().getTierId()).get();
		Double amountAbleToSpentUsingCoins=(tiers.getRedemptionLimitOfPurchase())*pointsAmountRequestDto.getAmount();
		Double pointsToUse=amountAbleToSpentUsingCoins/tiers.getConversion();
		Double amountToBePaid;
		PointsAmountResponseDto pointsAmountResponseDto=new PointsAmountResponseDto();
		if(pointsToUse<=user.getTotalPoints()) {
			amountToBePaid=pointsAmountRequestDto.getAmount()-amountAbleToSpentUsingCoins;
			//user.setTotalPoints(user.getTotalPoints()-pointsToUse);
			pointsAmountResponseDto.setSpentPoints(pointsToUse);
			pointsAmountResponseDto.setAmountToBePaid(amountToBePaid);
		}
		else {
			Double amountAvailabletoSpendUsingCoins=user.getTotalPoints()*tiers.getConversion();
			amountToBePaid=pointsAmountRequestDto.getAmount()-amountAvailabletoSpendUsingCoins;
			//user.setTotalPoints(0.0);
			pointsAmountResponseDto.setSpentPoints(user.getTotalPoints());
			pointsAmountResponseDto.setAmountToBePaid(amountToBePaid);
		}
		//user.setTotalPoints(user.getTotalPoints()+(tiers.getAccrualMultiplier()*amountToBePaid));
		pointsAmountResponseDto.setReceivedPoints(tiers.getAccrualMultiplier()*amountToBePaid);
		return pointsAmountResponseDto;
		
	}

	@Override
	public UserCouponResponseDto applyCoupon(UserCouponRequestDto userCouponRequestDto){
		UserCoupons userCoupon = userCouponRepository.findByCouponCode(userCouponRequestDto.getCouponCode());
		//System.out.println("usercouponretrived: " + userCoupon);
		Coupons coupon = userCoupon.getCoupons();
		//System.out.println("couponidretrived: " +  coupon );
		Double discountPercentage = coupon.getPercentage();
		Double maxLimit = coupon.getMaxLimit();
		Double discountedAmt = (discountPercentage)*(userCouponRequestDto.getAmount());
		UserCouponResponseDto userCouponResponseDto = new UserCouponResponseDto();
		UserValidationDto userValidationDto = new UserValidationDto();
		userValidationDto.setCouponCode(userCouponRequestDto.getCouponCode());
		userValidationDto.setuId(userCouponRequestDto.getuId());
		if(userCouponService.validateCoupon(userValidationDto)){
			if(discountedAmt<=maxLimit){
			userCouponResponseDto.setAmountDiscounted(discountedAmt);
			userCouponResponseDto.setFinalAmount(userCouponRequestDto.getAmount() - discountedAmt);
		}
		else{
			userCouponResponseDto.setAmountDiscounted(maxLimit);
			userCouponResponseDto.setFinalAmount(userCouponRequestDto.getAmount() - maxLimit);

		}}
		return userCouponResponseDto;



	}
	
	

}
