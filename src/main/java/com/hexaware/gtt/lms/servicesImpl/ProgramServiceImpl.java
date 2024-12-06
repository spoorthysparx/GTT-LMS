package com.hexaware.gtt.lms.servicesImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.gtt.lms.dto.ProgramRequestDto;
import com.hexaware.gtt.lms.entities.Partner;
import com.hexaware.gtt.lms.entities.Program;
import com.hexaware.gtt.lms.repositories.PartnerRepository;
import com.hexaware.gtt.lms.repositories.ProgramRepository;
import com.hexaware.gtt.lms.services.ProgramService;

@Service
public class ProgramServiceImpl implements ProgramService {

	@Autowired
	private ProgramRepository programRepository;
	@Autowired
	private PartnerRepository partnerRepository;

	@Override
	public Program createProgram(ProgramRequestDto programRequest) {
		Program program = new Program();
		program.setProgramName(programRequest.getProgramName());
		Partner partner = partnerRepository.findById(programRequest.getPartnerId()).orElse(null);
		program.setPartner(partner);
		program.setStatus(false);
		return programRepository.save(program);

	}

	@Override
	public List<Program> getAllPrograms() {
		return this.programRepository.findAll();
	}

	@Override
	    public List<Program> getAllPartnerPrograms(UUID partnerId) {
		 Partner partner = partnerRepository.findById(partnerId).orElseGet(null);
	        return this.programRepository.findAllProgramByPartner(partner);
	    }
}
