package com.hexaware.gtt.lms.dto;

import java.util.UUID;

public class OffersDto {

	private UUID offerId;
	private UUID tierId;
    private String offerTitle;
    private String offerDescription;
    private String imageUrl;
    private int benefit;
    private boolean status;
    
    

    public UUID getOfferId() {
		return offerId;
	}

	public void setOfferId(UUID offerId) {
		this.offerId = offerId;
	}

	public UUID getTierId() {
		return tierId;
	}

	public void setTierId(UUID tierId) {
		this.tierId = tierId;
	}

	public String getOfferTitle() {
        return offerTitle;
    }

    public void setOfferTitle(String offerTitle) {
        this.offerTitle = offerTitle;
    }

    public String getOfferDescription() {
        return offerDescription;
    }

    public void setOfferDescription(String offerDescription) {
        this.offerDescription = offerDescription;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getBenefit() {
        return benefit;
    }

    public void setBenefit(int benefit) {
        this.benefit = benefit;
    }

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
    
}

