package com.immoerp.webservices.RestfulApi.domain.exceptionhandler;

public class NameNotProvided extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8827760593764061619L;

	public NameNotProvided() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NameNotProvided(String message) {
		super(message);
	}

}
