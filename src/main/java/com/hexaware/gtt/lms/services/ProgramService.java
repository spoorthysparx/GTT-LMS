package com.hexaware.gtt.lms.services;

import com.hexaware.gtt.lms.dto.ProgramRequestDto;
import com.hexaware.gtt.lms.entities.Program;

public interface ProgramService {

	public Program createProgram(ProgramRequestDto programRequest);

}
