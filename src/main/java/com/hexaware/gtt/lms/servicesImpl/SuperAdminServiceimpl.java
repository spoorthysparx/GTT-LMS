package com.hexaware.gtt.lms.servicesImpl;

import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.gtt.lms.dto.SuperAdminDto;
import com.hexaware.gtt.lms.entities.Partner;
import com.hexaware.gtt.lms.entities.SuperAdmin;
import com.hexaware.gtt.lms.exception.ResourceNotFoundException;
import com.hexaware.gtt.lms.repositories.PartnerRepository;
import com.hexaware.gtt.lms.repositories.SuperAdminRepository;
import com.hexaware.gtt.lms.services.SuperAdminService;

@Service
public class SuperAdminServiceimpl implements SuperAdminService{

	@Autowired
	private SuperAdminRepository superAdminRepository;
	@Autowired
	private PartnerRepository partnerRepository;
	@Autowired	
	private ModelMapper  modelMapper;
	
	public SuperAdmin createSuperAdmin(SuperAdminDto sprdto)
	{
		SuperAdmin sprAdm=modelMapper.map(sprdto,SuperAdmin.class);
		sprAdm.setName(sprdto.getName());
		sprAdm.setEmail(sprdto.getEmail());
		sprAdm.setContact(sprdto.getContact());
		SuperAdmin sAdmin=this.superAdminRepository.save(sprAdm);
		return sAdmin;
		
	}
	
	
	public String statusUpdate(UUID partnerId) throws ResourceNotFoundException
	{
		if(partnerId!=null)
		{
			Partner part=partnerRepository.findById(partnerId).get();
			part.setStatus(true);
			partnerRepository.save(part);
			return "The Status is updated successfully...";
			}
		else {
			throw  new ResourceNotFoundException("Partner", "id", partnerId);
		}	
	
    }
	
	public List<Partner> getAllActivePartner(boolean stat)
	{
		List<Partner> ptList= partnerRepository.findPartnerByStatus(stat);
		return ptList;
		
		
	}
	
	
		}
