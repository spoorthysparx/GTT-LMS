package com.hexaware.gtt.lms.dto;

public class PointsAmountResponseDto {

	private Double amount;
	private Double spentPoints;
	private Double receivedPoints;
	public PointsAmountResponseDto(Double amount, Double spentPoints, Double receivedPoints) {
		super();
		this.amount = amount;
		this.spentPoints = spentPoints;
		this.receivedPoints = receivedPoints;
	}
	public PointsAmountResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getSpentPoints() {
		return spentPoints;
	}
	public void setSpentPoints(Double spentPoints) {
		this.spentPoints = spentPoints;
	}
	public Double getReceivedPoints() {
		return receivedPoints;
	}
	public void setReceivedPoints(Double receivedPoints) {
		this.receivedPoints = receivedPoints;
	}
	
	

}