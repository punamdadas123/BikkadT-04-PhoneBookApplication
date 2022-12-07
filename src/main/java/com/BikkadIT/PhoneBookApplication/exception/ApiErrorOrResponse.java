package com.BikkadIT.PhoneBookApplication.exception;

import java.util.Date;

public class ApiErrorOrResponse {

	private String errorDesc;
	private boolean success;
	private Date date;

	public String getErrorDesc() {
		return errorDesc;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public ApiErrorOrResponse(String errorDesc, boolean success, Date date) {
		super();
		this.errorDesc = errorDesc;
		this.success = success;
		this.date = date;
	}

}
