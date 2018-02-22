package com.immoerp.webservices.RestfulApi.domain.exceptionhandler;

import java.util.Date;

public class ExceptionResponse {
	
	private Date timestamp;
	public Date getDate() {
		return timestamp;
	}
	public void setDate(Date date) {
		this.timestamp = date;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	private String message;
	private String detail;
	
	public ExceptionResponse(Date date, String message, String detail) {
		super();
		this.timestamp = date;
		this.message = message;
		this.detail = detail;
	}

}
