package com.hexaware.gtt.lms.dto;

import java.time.LocalDateTime;
import java.util.UUID;

import com.hexaware.gtt.lms.entities.Coupons;
import com.hexaware.gtt.lms.entities.Users;
import com.hexaware.gtt.lms.enums.TransType;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class TransactionDto {
	private UUID transId;
	private Users users;
	private long paymentId;
	private Coupons coupons;
	private TransType transactionType;
	private double pointsGained;
	private double pointsSpent;
	private double amount;
	private LocalDateTime creationDate;
	public TransactionDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TransactionDto(UUID transId, Users users, long paymentId, Coupons coupons, TransType transactionType,
			double pointsGained, double pointsSpent, double amount, LocalDateTime creationDate) {
		super();
		this.transId = transId;
		this.users = users;
		this.paymentId = paymentId;
		this.coupons = coupons;
		this.transactionType = transactionType;
		this.pointsGained = pointsGained;
		this.pointsSpent = pointsSpent;
		this.amount = amount;
		this.creationDate = creationDate;
	}
	public UUID getTransId() {
		return transId;
	}
	public void setTransId(UUID transId) {
		this.transId = transId;
	}
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	public long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}
	public Coupons getCoupons() {
		return coupons;
	}
	public void setCoupons(Coupons coupons) {
		this.coupons = coupons;
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
	public LocalDateTime getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}
	@Override
	public String toString() {
		return "TransactionDto [transId=" + transId + ", users=" + users + ", paymentId=" + paymentId + ", coupons="
				+ coupons + ", transactionType=" + transactionType + ", pointsGained=" + pointsGained + ", pointsSpent="
				+ pointsSpent + ", amount=" + amount + ", creationDate=" + creationDate + "]";
	}
	
	

}
