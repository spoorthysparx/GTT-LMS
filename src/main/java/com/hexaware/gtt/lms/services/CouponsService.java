package com.hexaware.gtt.lms.services;
 
import java.util.List;
import java.util.UUID;
 
import com.hexaware.gtt.lms.dto.CouponsDto;
import com.hexaware.gtt.lms.entities.Coupons;
 
 
public interface CouponsService {
	public Coupons createCoupons(CouponsDto couponsDto);
	public List<Coupons> getCoupons();
	public Coupons updateCoupons(CouponsDto couponsDto,UUID coupon_id);
	public String deleteCoupons(UUID coupon_id);
	public Coupons getCouponsById(UUID coupon_id);
}
 
 