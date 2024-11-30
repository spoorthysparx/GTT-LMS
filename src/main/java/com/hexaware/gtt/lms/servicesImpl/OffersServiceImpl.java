package com.hexaware.gtt.lms.servicesImpl;
 
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.gtt.lms.dto.FreeTiersDto;
import com.hexaware.gtt.lms.dto.OffersDto;
import com.hexaware.gtt.lms.entities.Coupons;
import com.hexaware.gtt.lms.entities.Offers;
import com.hexaware.gtt.lms.entities.Tiers;
import com.hexaware.gtt.lms.repositories.OffersRepository;
import com.hexaware.gtt.lms.repositories.TiersRepository;
import com.hexaware.gtt.lms.services.OffersService;
 
@Service
public class OffersServiceImpl implements OffersService {
	
	
	private OffersRepository offersRepository;
	
	@Autowired
	private TiersRepository tiersRepository;
	
	private ModelMapper modelMapper;
	
	@Autowired
	public OffersServiceImpl(OffersRepository offersRepository, ModelMapper modelMapper) {
		super();
		this.offersRepository = offersRepository;
		this.modelMapper = modelMapper;
	}
 
 
 
 
	@Override
	public List<Offers> getOffers() {
		 List<Offers> offersList= offersRepository.findAll();
		 return offersList;
	}
 
 
 
 
	@Override
	public Offers createOffers(OffersDto offersDto) {

		Offers offers = this.modelMapper.map(offersDto,Offers.class);
		Tiers tiers = this.tiersRepository.findById(offersDto.getTierId()).get();
		offers.setTiers(tiers);
		return this.offersRepository.save(offers);
	}
 
 
 
 
	@Override
	public Offers updateOffers(OffersDto offersDto,UUID offer_id) {
		Offers offers=this.modelMapper.map(offersDto, Offers.class);
		Offers offer=this.offersRepository.findById(offer_id).get();
		if(offer !=null) {
		
		
		offer.setImageUrl(offers.getImageUrl());
		offer.setBenefit(offers.getBenefit());
		offer.setOfferDescription(offers.getOfferDescription());
		offer.setOfferTitle(offers.getOfferTitle());
		Tiers tiers = this.tiersRepository.findById(offersDto.getTierId()).get();
		offer.setTiers(tiers);
		offer.setStartDate(offers.getStartDate());
		offer.setStatus(offers.isStatus());
		
		 return this.offersRepository.save(offer);
		
		}
		else {
			return null;
		}
		
		
		
		
		
	}
 
 
	@Override
	public String deleteOffers(UUID offer_id) {
		
		Offers offer=this.offersRepository.findById(offer_id).get();
		if(offer !=null) {
			this.offersRepository.delete(offer);
			return " offer "+offer_id+"deleted successfully" ;
		}
		else {
			return "offer"+offer_id + "doesn't exist" ;
		}
	}
 
 
 
 
	@Override
	public Offers getOfferById(UUID offer_id) {
		Offers offer=this.offersRepository.findById(offer_id).get();
		if(offer !=null) {
			return offer;
		}
		else {
			return null ;
		}
		
	}
	
		
 
}
 
 