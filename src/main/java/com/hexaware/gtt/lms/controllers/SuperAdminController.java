package com.hexaware.gtt.lms.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.gtt.lms.dto.PartnerDto;
import com.hexaware.gtt.lms.dto.SuperAdminDto;
import com.hexaware.gtt.lms.entities.Partner;
import com.hexaware.gtt.lms.entities.SuperAdmin;
import com.hexaware.gtt.lms.exception.ResourceNotFoundException;
import com.hexaware.gtt.lms.services.SuperAdminService;

@RestController
@ResponseBody
@RequestMapping("/api/v1/lms/SuperAdmin")
public class SuperAdminController {
	
	@Autowired
	private SuperAdminService superAdminService; 
	@Autowired
	private ModelMapper  modelMapper;
	
	
	
	@PostMapping("CreateSuperAdmin")
	public ResponseEntity<?> CreatingSuperAdmin(@RequestBody SuperAdminDto spradmDto)
	{
		
		SuperAdmin sprAdm=superAdminService.createSuperAdmin(spradmDto);
			SuperAdminDto sprAd=	modelMapper.map(sprAdm, SuperAdminDto.class);
			return ResponseEntity.ok(sprAd);
		
				
	}
	
	
	@PutMapping("UpdatingPartner")
	public ResponseEntity<?> UpdatingPartner(@RequestParam("id")UUID id)
	{
		try {
		
			String msg=superAdminService.statusUpdate(id);
			return ResponseEntity.ok(msg);
		
		}
		catch(ResourceNotFoundException e)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}
	
	@GetMapping("GetpartnerByStatus")
	public ResponseEntity<?> GetAllPartner(@RequestParam("status") boolean state)
	{
		List<Partner> ptList=superAdminService.getAllActivePartner(state);
		List<PartnerDto> ptDtoList=new ArrayList();
		for(Partner p:ptList)
		{
			ptDtoList.add(modelMapper.map(p, PartnerDto.class));
		}
		
		return ResponseEntity.ok(ptDtoList);
	}

}
