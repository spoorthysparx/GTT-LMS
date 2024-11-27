package com.hexaware.gtt.lms.dto;

import com.hexaware.gtt.lms.entities.Tiers;

public class CouponsDto {
    private Tiers tier_id;
 
	private String couponTitle;
	private String couponDescription;
	private int validity;
	private String couponCode;
	private int benefits;
 
	private boolean status;

    public Tiers getTier_id() {
        return tier_id;
    }

    public void setTier_id(Tiers tier_id) {
        this.tier_id = tier_id;
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

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public int getBenefits() {
        return benefits;
    }

    public void setBenefits(int benefits) {
        this.benefits = benefits;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


}
