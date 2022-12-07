package com.BikkadIT.PhoneBookApplication.exception;

public class ResourceNotFoundException extends RuntimeException {

	
	 String resouraceName;
	 String fieldName;
	 long fieldValue;
	 
	public ResourceNotFoundException(String resouraceName, String fieldName, long fieldValue) {
		super(String.format("%s not found with %s : %s",resouraceName,fieldName,fieldValue));
		this.resouraceName = resouraceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

	public String getResouraceName() {
		return resouraceName;
	}

	public void setResouraceName(String resouraceName) {
		this.resouraceName = resouraceName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public long getFieldValue() {
		return fieldValue;
	}

	public void setFieldValue(long fieldValue) {
		this.fieldValue = fieldValue;
	}
	 
}
