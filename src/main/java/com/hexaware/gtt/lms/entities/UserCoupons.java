package com.hexaware.gtt.lms.entities;

import java.time.LocalDateTime;

import com.hexaware.gtt.lms.enums.UserCouponStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
 
@Entity
public class UserCoupons {
 
	@Id
    private String couponCode;

    @ManyToOne
    @JoinColumn(name = "couponId")
    private Coupons couponId;
 
    @ManyToOne
    @JoinColumn(name = "u_id")
    private Users user_id;
    private LocalDateTime issuedOn;
 
    @Enumerated(EnumType.STRING)
    private UserCouponStatus status;
 
    private LocalDateTime expiry;
    private LocalDateTime couponUsedDate;
 
    @Column(updatable = false)
    private LocalDateTime acquiredDate = LocalDateTime.now();

 
	public Coupons getCouponId() {
        return couponId;
    }
 
    public void setCouponId(Coupons couponId) {
        this.couponId = couponId;
    }
 
    public Users getUser_id() {
        return user_id;
    }
 
    public void setUser_id(Users user_id) {
        this.user_id = user_id;
    }
 
    public String getCouponCode() {
        return couponCode;
    }
 
    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }
 
    public LocalDateTime getIssuedOn() {
        return issuedOn;
    }
 
    public void setIssuedOn(LocalDateTime issuedOn) {
        this.issuedOn = issuedOn;
    }
 
    public UserCouponStatus getStatus() {
        return status;
    }
 
    public void setStatus(UserCouponStatus status) {
        this.status = status;
    }
 
    public LocalDateTime getExpiry() {
        return expiry;
    }
 
    public void setExpiry(LocalDateTime expiry) {
        this.expiry = expiry;
    }
 
    public LocalDateTime getCouponUsedDate() {
        return couponUsedDate;
    }
 
    public void setCouponUsedDate(LocalDateTime couponUsedDate) {
        this.couponUsedDate = couponUsedDate;
    }
 
    public LocalDateTime getAcquiredDate() {
        return acquiredDate;
    }
 
    public void setAcquiredDate(LocalDateTime acquiredDate) {
        this.acquiredDate = acquiredDate;
    }
}
