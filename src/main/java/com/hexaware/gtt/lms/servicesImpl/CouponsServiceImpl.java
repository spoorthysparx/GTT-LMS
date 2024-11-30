package com.hexaware.gtt.lms.servicesImpl;
 
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.gtt.lms.dto.CouponsDto;
import com.hexaware.gtt.lms.entities.Coupons;
import com.hexaware.gtt.lms.entities.Tiers;
import com.hexaware.gtt.lms.repositories.CouponsRepository;
import com.hexaware.gtt.lms.repositories.TiersRepository;
import com.hexaware.gtt.lms.services.CouponsService;
 
@Service
public class CouponsServiceImpl implements CouponsService{
	
private CouponsRepository couponsRepository;
private TiersRepository tiersRepository;
private ModelMapper modelMapper;
	
	@Autowired
	public CouponsServiceImpl(CouponsRepository couponsRepository, ModelMapper modelMapper, TiersRepository tiersRepository) {
	super();
	this.couponsRepository = couponsRepository;
	this.modelMapper = modelMapper;
	this.tiersRepository = tiersRepository;
}
 
 
	@Override
	public Coupons createCoupons(CouponsDto couponsDto) {
		
		Coupons coupons = this.modelMapper.map(couponsDto,Coupons.class);
		Tiers tiers = this.tiersRepository.findById(couponsDto.getTierId()).get();
		coupons.setTiers(tiers);
		return this.couponsRepository.save(coupons);
	}
 
 
	@Override
	public List<Coupons> getCoupons() {
	List<Coupons> couponsList=this.couponsRepository.findAll();
	return couponsList;
	}
 
 
	@Override
	public Coupons updateCoupons(CouponsDto couponsDto, UUID coupon_id) {
		Coupons coupons=this.couponsRepository.findById(coupon_id).get();
		System.out.println(coupons);
		if(coupons!=null) {
			coupons.setCouponTitle(couponsDto.getCouponTitle());
			coupons.setBenefits(couponsDto.getBenefits());
			coupons.setCouponDescription(couponsDto.getCouponDescription());
			coupons.setStatus(couponsDto.isStatus());
			Tiers tiers = this.tiersRepository.findById(couponsDto.getTierId()).get();
			System.out.println(this.tiersRepository.findById(couponsDto.getTierId()).get());
			coupons.setTiers(tiers);
			coupons.setValidity(couponsDto.getValidity());
			
			return this.couponsRepository.save(coupons);
		}
		else {
			return null;
		}
		
	}
 
 
	@Override
	public String deleteCoupons(UUID coupon_id) {
		Coupons coupons=this.couponsRepository.findById(coupon_id).get();
		if(coupons !=null) {
			this.couponsRepository.delete(coupons);
			return " coupon "+coupon_id+"deleted successfully" ;
		}
		else {
			return "coupon"+coupon_id + "doesn't exist" ;
		}
	}
 
 
	@Override
	public Coupons getCouponsById(UUID coupon_id) {
		Coupons coupons=this.couponsRepository.findById(coupon_id).get();
		if(coupons !=null) {
			return coupons;
		}
		else {
			return null ;
		}
	}
 
 
}
 