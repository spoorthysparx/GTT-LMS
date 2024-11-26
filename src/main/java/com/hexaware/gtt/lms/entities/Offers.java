package com.hexaware.gtt.lms.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Offers {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID offerId;

    @ManyToOne
    @JoinColumn(name = "tier_id", nullable=false, updatable=false)
    private Tiers tier_id;

    private String offerTitle;
    private String offerDescription;
    private String imageUrl;

    @Column(updatable = false)
    private LocalDateTime startDate = LocalDateTime.now();

    private int benefit;


    public UUID getOfferId() {
        return offerId;
    }

    public void setOfferId(UUID offerId) {
        this.offerId = offerId;
    }

    public Tiers getTier_id() {
        return tier_id;
    }

    public void setTier_id(Tiers tier_id) {
        this.tier_id = tier_id;
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

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public int getBenefit() {
        return benefit;
    }

    public void setBenefit(int benefit) {
        this.benefit = benefit;
    }

}
