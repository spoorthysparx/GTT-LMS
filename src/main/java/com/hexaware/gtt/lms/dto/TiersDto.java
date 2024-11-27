package com.hexaware.gtt.lms.dto;

public class TiersDto {
    private String tierName;
    private double triggerAmount;
    private int triggerDuration; //days
    private double accrualMultiplier;
    private int redemptionLimitOfPurchase;
    private double conversion;
    private String description;
    private float couponProbability;

    public String getTierName() {
        return tierName;
    }

    public void setTierName(String tierName) {
        this.tierName = tierName;
    }

    public double getTriggerAmount() {
        return triggerAmount;
    }

    public void setTriggerAmount(double triggerAmount) {
        this.triggerAmount = triggerAmount;
    }

    public int getTriggerDuration() {
        return triggerDuration;
    }

    public void setTriggerDuration(int triggerDuration) {
        this.triggerDuration = triggerDuration;
    }

    public double getAccrualMultiplier() {
        return accrualMultiplier;
    }

    public void setAccrualMultiplier(double accrualMultiplier) {
        this.accrualMultiplier = accrualMultiplier;
    }

    public int getRedemptionLimitOfPurchase() {
        return redemptionLimitOfPurchase;
    }

    public void setRedemptionLimitOfPurchase(int redemptionLimitOfPurchase) {
        this.redemptionLimitOfPurchase = redemptionLimitOfPurchase;
    }

    public double getConversion() {
        return conversion;
    }

    public void setConversion(double conversion) {
        this.conversion = conversion;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getCouponProbability() {
        return couponProbability;
    }

    public void setCouponProbability(float couponProbability) {
        this.couponProbability = couponProbability;
    }

}
