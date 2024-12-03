package com.hexaware.gtt.lms.dto;

import java.util.UUID;

import jakarta.validation.constraints.Email;

public class SuperAdminDto {
	
	UUID Id;

	String name;
	
	long contact;
	
	@Email
	String email;

	public UUID getId() {
		return Id;
	}

	public void setId(UUID id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
