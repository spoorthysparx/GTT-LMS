package com.hexaware.gtt.lms.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.gtt.lms.dto.ProgramRequestDto;
import com.hexaware.gtt.lms.entities.Program;
import com.hexaware.gtt.lms.repositories.ProgramRepository;
import com.hexaware.gtt.lms.services.ProgramService;
@Service
public class ProgramServiceImpl implements ProgramService {

	@Autowired
	private ProgramRepository programRepository;

	@Override
	public Program createProgram(ProgramRequestDto programRequest) {
		Program program = new Program();
		program.setProgramName(programRequest.getProgramName());
		program.setStatus(false);
		return programRepository.save(program);

	}

}
