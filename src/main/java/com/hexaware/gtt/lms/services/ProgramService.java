package com.hexaware.gtt.lms.services;

import java.util.List;
import java.util.UUID;

import com.hexaware.gtt.lms.dto.ProgramRequestDto;
import com.hexaware.gtt.lms.entities.Program;

public interface ProgramService {

	public Program createProgram(ProgramRequestDto programRequest);
	public List<Program> getAllPrograms();
	public List<Program> getAllPartnerPrograms(UUID partnerId) ;
}
