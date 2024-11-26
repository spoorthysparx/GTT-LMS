package com.hexaware.gtt.lms.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import com.hexaware.gtt.lms.enums.TransType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Transactions {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID transId;

    @ManyToOne
    @JoinColumn(name = "u_id")
    private Users user;

    private long paymentId;

    @ManyToOne
    @JoinColumn(name = "coupon_id")
    private Coupons coupon;

    @Enumerated(EnumType.STRING)
    private TransType Type;

    private int pointsGainedOrLost;
    private double amount;

    @Column(updatable = false)
    private final LocalDateTime creationDate = LocalDateTime.now();

    public UUID getTransId() {
        return transId;
    }

    public void setTransId(UUID transId) {
        this.transId = transId;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(long paymentId) {
        this.paymentId = paymentId;
    }

    public Coupons getCoupon() {
        return coupon;
    }

    public void setCoupon(Coupons coupon) {
        this.coupon = coupon;
    }

    public TransType getType() {
        return Type;
    }

    public void setType(TransType Type) {
        this.Type = Type;
    }

    public int getPointsGainedOrLost() {
        return pointsGainedOrLost;
    }

    public void setPointsGainedOrLost(int pointsGainedOrLost) {
        this.pointsGainedOrLost = pointsGainedOrLost;
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

}
