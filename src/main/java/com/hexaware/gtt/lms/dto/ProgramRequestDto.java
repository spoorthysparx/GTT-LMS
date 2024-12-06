package com.hexaware.gtt.lms.dto;

import java.util.UUID;

public class ProgramRequestDto {
	private String programName;
	 private UUID partnerId;
	private boolean status;
	

	public ProgramRequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public ProgramRequestDto(String programName, UUID partnerId, boolean status) {
		super();
		this.programName = programName;
		this.partnerId = partnerId;
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

	public UUID getPartnerId() {
		return partnerId;
	}


	public void setPartnerId(UUID partnerId) {
		this.partnerId = partnerId;
	}


	@Override
	public String toString() {
		return "ProgramRequestDto [programName=" + programName + ", partnerId=" + partnerId + ", status=" + status
				+ "]";
	}


	



}
