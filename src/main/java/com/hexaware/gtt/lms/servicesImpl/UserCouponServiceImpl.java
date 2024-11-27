/*package com.hexaware.gtt.lms.servicesImpl;

import java.util.Random;
import java.util.UUID;
 
import org.springframework.beans.factory.annotation.Autowired;
 
import com.hexaware.gtt.lms.entities.UserCoupons;
import com.hexaware.gtt.lms.entities.Users;
import com.hexaware.gtt.lms.repositories.TierRepository;
import com.hexaware.gtt.lms.repositories.UserCouponRepository;
import com.hexaware.gtt.lms.repositories.UserRepository;
import com.hexaware.gtt.lms.services.UserCouponService;
 
public class UserCouponServiceImpl implements UserCouponService {
 
    @Autowired
    private UserCouponRepository userCouponRepository;
    private TierRepository tierRepository;
    private UserRepository userRepository;
 
    public String generate(UUID couponId) {
        String coupon;
        UserCoupons userCoupon = userCouponRepository.getById(couponId);
        UUID tierId = userRepository.getTierId(u_id);
        tierRepository.getCouponProbablity(tierId);
        do {
            coupon = generateRandomCouponCode(6);
        } while (generatedCoupons.contains(coupon));
        generatedCoupons.add(coupon);
        return coupon;
    }
 
    public boolean redeemCoupon(String couponCode) {
        String coupon;
        UserCoupons userCoupon = userCouponRepository.findCouponByCouponCode(couponCode);
        Users currentUser = userCoupon.getUser_id();
        UUID u_id = currentUser.getuId();
        UUID tierId = userRepository.getTierId(u_id);
        tierRepository.getCouponProbablity(tierId);
        return false;
    }
 
    private String generateRandomCouponCode(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder couponCode = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            couponCode.append(characters.charAt(random.nextInt(characters.length())));
        }
        return couponCode.toString();
    }
 
    public String awardCoupon() {
        if (Math.random() < couponProbability) {
            return generateUniqueCoupon();
        } else {
            return null;
        }
    }
 
}
*/