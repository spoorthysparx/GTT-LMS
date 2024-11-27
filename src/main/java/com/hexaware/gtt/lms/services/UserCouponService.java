package com.hexaware.gtt.lms.services;

import java.util.UUID;

import com.hexaware.gtt.lms.entities.UserCoupons;

public interface UserCouponService {
	  public UserCoupons generateCoupon(UUID couponId, UUID u_id);
	 public boolean redeemCoupon(String couponCode);
	 
}
