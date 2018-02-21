package com.immoerp.webservices.RestfulApi.doman.exceptionhandler;

public class UserNotFoundException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8634197262983639387L;

	public UserNotFoundException(String message) {
		super(message);
	}
	
	

}
