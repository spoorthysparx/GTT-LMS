package com.hexaware.gtt.lms.dto;

import java.util.UUID;

import com.hexaware.gtt.lms.entities.Tiers;

public class CouponsResponseDto {

	private UUID tierId;
	private UUID couponId;
	private UUID programId;
	private String couponTitle;
	private String couponDescription;
	private int validity;
	private double percentage;
	private double maxLimit;

	private boolean status;

	public CouponsResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CouponsResponseDto(UUID tierId, UUID couponId, UUID programId, String couponTitle, String couponDescription,
			int validity, double percentage, double maxLimit, boolean status) {
		super();
		this.tierId = tierId;
		this.couponId = couponId;
		this.programId = programId;
		this.couponTitle = couponTitle;
		this.couponDescription = couponDescription;
		this.validity = validity;
		this.percentage = percentage;
		this.maxLimit = maxLimit;
		this.status = status;
	}

	public UUID getTierId() {
		return tierId;
	}

	public void setTierId(UUID tierId) {
		this.tierId = tierId;
	}

	public UUID getCouponId() {
		return couponId;
	}

	public void setCouponId(UUID couponId) {
		this.couponId = couponId;
	}

	public UUID getProgramId() {
		return programId;
	}

	public void setProgramId(UUID programId) {
		this.programId = programId;
	}

	public String getCouponTitle() {
		return couponTitle;
	}

	public void setCouponTitle(String couponTitle) {
		this.couponTitle = couponTitle;
	}

	public String getCouponDescription() {
		return couponDescription;
	}

	public void setCouponDescription(String couponDescription) {
		this.couponDescription = couponDescription;
	}

	public int getValidity() {
		return validity;
	}

	public void setValidity(int validity) {
		this.validity = validity;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public double getMaxLimit() {
		return maxLimit;
	}

	public void setMaxLimit(double maxLimit) {
		this.maxLimit = maxLimit;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "CouponsResponseDto [tierId=" + tierId + ", couponId=" + couponId + ", programId=" + programId
				+ ", couponTitle=" + couponTitle + ", couponDescription=" + couponDescription + ", validity=" + validity
				+ ", percentage=" + percentage + ", maxLimit=" + maxLimit + ", status=" + status + "]";
	}

	

}
