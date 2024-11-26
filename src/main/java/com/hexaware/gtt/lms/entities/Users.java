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
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uId;

    private long userId; //from partner db

    @ManyToOne
    @JoinColumn(name = "partner_id", nullable = false, updatable = false)
    private Partner partner_id;

    @ManyToOne
    @JoinColumn(name = "tier_id", nullable = false, updatable = false)
    private Tiers tier_id;

    private int totalPoints;

    @Column(updatable = false)
    private final LocalDateTime date = LocalDateTime.now();

    private LocalDateTime expiry;

    public UUID getuId() {
        return uId;
    }

    public void setuId(UUID uId) {
        this.uId = uId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public Partner getPartner_id() {
        return partner_id;
    }

    public void setPartner_id(Partner partner_id) {
        this.partner_id = partner_id;
    }

    public Tiers getTier_id() {
        return tier_id;
    }

    public void setTier_id(Tiers tier_id) {
        this.tier_id = tier_id;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public LocalDateTime getExpiry() {
        return expiry;
    }

    public void setExpiry(LocalDateTime expiry) {
        this.expiry = expiry;
    }

}
