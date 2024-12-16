package com.hexaware.gtt.lms.services;

import com.hexaware.gtt.lms.dto.PointsAmountRequestDto;
import com.hexaware.gtt.lms.dto.PointsAmountResponseDto;
import com.hexaware.gtt.lms.dto.TransactionDto;
import com.hexaware.gtt.lms.dto.TransactionRequestDto;
import com.hexaware.gtt.lms.dto.UserCouponRequestDto;
import com.hexaware.gtt.lms.dto.UserCouponResponseDto;


public interface TransactionService {
	public PointsAmountResponseDto finalAmount(PointsAmountRequestDto pointsAmountRequestDto);
	public UserCouponResponseDto applyCoupon(UserCouponRequestDto userCouponRequestDto);
	public TransactionDto createTransaction(TransactionRequestDto transactionRequestDto) throws Exception;
	public PointsAmountResponseDto getAccrualPoints(PointsAmountRequestDto pointsAmountRequestDto);
}
