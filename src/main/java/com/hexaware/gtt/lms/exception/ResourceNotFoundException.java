package com.hexaware.gtt.lms.exception;

import java.util.UUID;

public class ResourceNotFoundException extends Exception{
	private String resourceName;
	private String fieldName;
	private UUID fieldValue;
	private String stringFieldValue;
	private String message;
	
	public ResourceNotFoundException(String resourceName, String fieldName, UUID fieldValue) {
		super();
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
	public ResourceNotFoundException(String resourceName, String fieldName, String stringFieldValue) {
		super();
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.stringFieldValue=stringFieldValue;
	}
	
	public String getMessage() {
		if(this.fieldValue==null && this.message==null) {
			return this.resourceName+" is not found with "+this.fieldName+" "+this.stringFieldValue;
		}
		else if(this.message==null && this.stringFieldValue==null) {
			return this.resourceName+" is not found with "+this.fieldName+" "+this.fieldValue;
		}
		else {
			return message;
		}
	}

	public ResourceNotFoundException(String message) {
        super(message);
        this.message = message;
    }
		
}
