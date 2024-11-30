package com.hexaware.gtt.lms.dto;

import java.util.UUID;

import com.hexaware.gtt.lms.entities.Tiers;

public class OffersResponseDto {

	
	
		private UUID offerId;
		private Tiers tiers;
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

		

		public Tiers getTiers() {
			return tiers;
		}

		public void setTiers(Tiers tiers) {
			this.tiers = tiers;
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



