package com.hexaware.gtt.lms.repositories;

 
import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.gtt.lms.entities.UserCoupons;
 
public interface UserCouponRepository extends JpaRepository<UserCoupons, String>{
   
    UserCoupons findCouponByCouponCode(String couponCode);
 
}