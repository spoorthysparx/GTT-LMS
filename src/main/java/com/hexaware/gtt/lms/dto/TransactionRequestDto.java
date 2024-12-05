package com.hexaware.gtt.lms.dto;

import java.util.UUID;

import com.hexaware.gtt.lms.enums.TransType;

public class TransactionRequestDto {
	private long userId;
	private UUID partnerId;
	private long paymentId;
	private UUID couponId;
	private TransType transactionType;
	private double pointsGained;
	private double pointsSpent;
	private double amount;
	

	
	public TransactionRequestDto(long userId, UUID partnerId, long paymentId, UUID couponId, TransType transactionType,
			double pointsGained, double pointsSpent, double amount) {
		super();
		this.userId = userId;
		this.partnerId = partnerId;
		this.paymentId = paymentId;
		this.couponId = couponId;
		this.transactionType = transactionType;
		this.pointsGained = pointsGained;
		this.pointsSpent = pointsSpent;
		this.amount = amount;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public UUID getPartnerId() {
		return partnerId;
	}
	public void setPartnerId(UUID partnerId) {
		this.partnerId = partnerId;
	}
	public long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}
	public UUID getCouponId() {
		return couponId;
	}
	public void setCouponId(UUID couponId) {
		this.couponId = couponId;
	}
	public TransType getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(TransType transactionType) {
		this.transactionType = transactionType;
	}
	public double getPointsGained() {
		return pointsGained;
	}
	public void setPointsGained(double pointsGained) {
		this.pointsGained = pointsGained;
	}
	public double getPointsSpent() {
		return pointsSpent;
	}
	public void setPointsSpent(double pointsSpent) {
		this.pointsSpent = pointsSpent;
	}

	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "TransactionRequestDto [userId=" + userId + ", partnerId=" + partnerId + ", paymentId=" + paymentId
				+ ", couponId=" + couponId + ", transactionType=" + transactionType + ", pointsGained=" + pointsGained
				+ ", pointsSpent=" + pointsSpent + ", amount=" + amount + "]";
	}


	

}
