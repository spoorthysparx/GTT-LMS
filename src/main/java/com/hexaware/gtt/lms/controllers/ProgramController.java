package com.hexaware.gtt.lms.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.gtt.lms.dto.ProgramRequestDto;
import com.hexaware.gtt.lms.entities.Program;
import com.hexaware.gtt.lms.services.ProgramService;

@RestController
@RequestMapping("/api/v1/lms/programs")
public class ProgramController {
	private ProgramService programService;
	private ModelMapper modelMapper;
	@Autowired
	public ProgramController(ProgramService programService,  ModelMapper modelMapper) {
		this.programService = programService;
		this.modelMapper = modelMapper;
	}
		@PostMapping("/createProgram")
		public ResponseEntity<?> createProgram(@RequestBody ProgramRequestDto programRequest){
			Program program = programService.createProgram(programRequest);
			
			return new ResponseEntity<>("Program created Successfully with ID: "+program.getProgramId(), HttpStatus.CREATED);
		}
}
