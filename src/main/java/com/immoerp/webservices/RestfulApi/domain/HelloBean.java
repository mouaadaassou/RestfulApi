package com.immoerp.webservices.RestfulApi.domain;


public class HelloBean {

	private String message;
	
	@Override
	public String toString() {
		return "HelloBean [message=" + message + "]";
	}

	public HelloBean(String message) {
		this.setMessage(message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
