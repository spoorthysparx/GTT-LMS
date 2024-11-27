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

	@Column(updatable = false)
	private LocalDateTime issuedOn;

	@Enumerated(EnumType.STRING)
	private UserCouponStatus status;

	private LocalDateTime expiry;
	private LocalDateTime couponUsedDate;

	

	public UserCoupons(String couponCode, Coupons couponId, Users user_id, LocalDateTime issuedOn, UserCouponStatus status,
			LocalDateTime expiry, LocalDateTime couponUsedDate) {
		super();
		this.couponCode = couponCode;
		this.couponId = couponId;
		this.user_id = user_id;
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
		return user_id;
	}

	public void setUser_id(Users user_id) {
		this.user_id = user_id;
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
