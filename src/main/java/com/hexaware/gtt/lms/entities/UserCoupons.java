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
	private Users userId;

	@Column(updatable = false)
	private LocalDateTime issuedOn;

	@Enumerated(EnumType.STRING)
	private UserCouponStatus status = UserCouponStatus.ACTIVE;

	private LocalDateTime expiry;
	private LocalDateTime couponUsedDate;

	

	public UserCoupons() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserCoupons(String couponCode, Coupons couponId, Users userId, LocalDateTime issuedOn, UserCouponStatus status,
			LocalDateTime expiry, LocalDateTime couponUsedDate) {
		super();
		this.couponCode = couponCode;
		this.couponId = couponId;
		this.userId = userId;
		this.issuedOn = issuedOn;
		this.status = status;
		this.expiry = expiry;
		this.couponUsedDate = couponUsedDate;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public Coupons getCouponId() {
		return couponId;
	}

	public void setCouponId(Coupons couponId) {
		this.couponId = couponId;
	}

	public Users getUser_id() {
		return userId;
	}

	public void setUser_id(Users userId) {
		this.userId = userId;
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



}
