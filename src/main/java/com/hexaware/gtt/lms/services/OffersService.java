package com.hexaware.gtt.lms.services;
 
import java.util.List;
import java.util.UUID;
 
import com.hexaware.gtt.lms.dto.OffersDto;
import com.hexaware.gtt.lms.entities.Offers;
 
public interface OffersService {
	public Offers createOffers(OffersDto offersDto);
	public List<Offers> getOffers();
	public Offers updateOffers(OffersDto offersDto,UUID offer_id);
	public String deleteOffers(UUID offer_id);
	public Offers getOfferById(UUID offer_id);
}
 
 