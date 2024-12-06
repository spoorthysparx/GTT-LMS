package com.hexaware.gtt.lms.dto;

public class ProgramRequestDto {
	private String programName;
	private boolean status;
	

	public ProgramRequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProgramRequestDto(String programName, boolean status) {
		super();
		this.programName = programName;
		this.status = status;
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ProgramRequestDto [programName=" + programName + ", status=" + status + "]";
	}



}
