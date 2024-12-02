package com.hexaware.gtt.lms.exception;

import java.util.UUID;

public class DuplicateDataException extends RuntimeException {
	private String fieldMessage;
	private String resourceName;
	private String fieldName;
	private String fieldValue;
	
    public DuplicateDataException(String message) {
        super();
        this.fieldMessage=message;
    }
    public String getMessage() {
    	if(this.fieldValue!= null) {
    		return this.resourceName + "'s" +fieldName+" ("+ this.fieldValue+") already exist" ;
    	}
    	return fieldMessage;
    }
	public DuplicateDataException(String resourceName, String fieldName, String fieldValue) {
		super();
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
    
    
}
