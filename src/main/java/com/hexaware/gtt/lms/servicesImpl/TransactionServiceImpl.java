package com.hexaware.gtt.lms.servicesImpl;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.gtt.lms.dto.PointsAmountRequestDto;
import com.hexaware.gtt.lms.dto.PointsAmountResponseDto;
import com.hexaware.gtt.lms.entities.Tiers;
import com.hexaware.gtt.lms.entities.Users;
import com.hexaware.gtt.lms.repositories.TiersRepository;
import com.hexaware.gtt.lms.repositories.UserRepository;
import com.hexaware.gtt.lms.services.TransactionService;
@Service
public class TransactionServiceImpl implements TransactionService{

	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private TiersRepository tiersRepository;
	
	
	
	@Override
	public PointsAmountResponseDto finalAmount(PointsAmountRequestDto pointsAmountRequestDto) {
		UUID uId=userRepository.findUIdByPartnerIdAndUserId(pointsAmountRequestDto.getPartnerId(),pointsAmountRequestDto.getUserId());
		Users user=userRepository.findByUId(uId);
		Tiers tiers=tiersRepository.findById(user.getTiers().getTierId()).get();
		Double amountAbleToSpentUsingCoins=(tiers.getRedemptionLimitOfPurchase())*pointsAmountRequestDto.getAmount();//1000 rupees for 5000 of 20% redemptionlimit
		Double pointsToUse=amountAbleToSpentUsingCoins*tiers.getConversion();//100 points
		System.out.println(pointsToUse);
		Double amountToBePaid;
		PointsAmountResponseDto pointsAmountResponseDto=new PointsAmountResponseDto();
		if(pointsToUse<=user.getTotalPoints()) {
			amountToBePaid=pointsAmountRequestDto.getAmount()-amountAbleToSpentUsingCoins;
			//user.setTotalPoints(user.getTotalPoints()-pointsToUse);
			pointsAmountResponseDto.setSpentPoints(pointsToUse);
			pointsAmountResponseDto.setAmount(amountToBePaid);
		}
		else {
			Double amountAvailabletoSpendUsingCoins=user.getTotalPoints()/tiers.getConversion();
			amountToBePaid=pointsAmountRequestDto.getAmount()-amountAvailabletoSpendUsingCoins;
			//user.setTotalPoints(0.0);
			System.out.println(user.getTotalPoints());
			pointsAmountResponseDto.setSpentPoints(user.getTotalPoints());
			pointsAmountResponseDto.setAmount(amountToBePaid);
		}
		//user.setTotalPoints(user.getTotalPoints()+(tiers.getAccrualMultiplier()*amountToBePaid));
		pointsAmountResponseDto.setReceivedPoints(tiers.getAccrualMultiplier()*amountToBePaid);
		
		System.out.println(user.getTotalPoints());
	
		return pointsAmountResponseDto;
		
	}
	

}
