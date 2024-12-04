package com.hexaware.gtt.lms.services;

import com.hexaware.gtt.lms.dto.UserCouponRequestDto;
import com.hexaware.gtt.lms.dto.UserCouponResponseDto;
import com.hexaware.gtt.lms.dto.PointsAmountRequestDto;
import com.hexaware.gtt.lms.dto.PointsAmountResponseDto;


public interface TransactionService {
	public PointsAmountResponseDto finalAmount(PointsAmountRequestDto pointsAmountRequestDto);
	public UserCouponResponseDto applyCoupon(UserCouponRequestDto userCouponRequestDto);

}
