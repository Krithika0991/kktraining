package com.taining.exceptions;

public class UsernameExistsException extends Throwable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Exception UsernameExists() {
		return new Exception("username already exists");
		// TODO Auto-generated constructor stub
	}

}
