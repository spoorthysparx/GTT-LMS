package com.hexaware.gtt.lms.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hexaware.gtt.lms.entities.Coupons;
import com.hexaware.gtt.lms.entities.UserCoupons;

@Repository
public interface UserCouponRepository extends JpaRepository<UserCoupons, String> {

	UserCoupons findCouponByCouponCode(String couponCode);

	boolean existsCouponByCouponCode(String couponCode);

	List<UserCoupons> findUserCouponsByUsers_UId(UUID UId);

	UserCoupons findByCouponCode(String couponCode);


	@Query(value="SELECT * FROM User_coupons u where u.status='ACTIVE' AND u.u_id=:uId ",nativeQuery=true)
	List<UserCoupons> findActiveCouponsByuId(@Param("uId") UUID uId);
	//List<UserCoupons> findActiveCouponsByuId(UUID uId);
	
	@Query(value="select * from user_coupons u where u.u_id=:uId", nativeQuery=true)
	
	List<UserCoupons> getAllUsers(@Param("uId") UUID uId);

}