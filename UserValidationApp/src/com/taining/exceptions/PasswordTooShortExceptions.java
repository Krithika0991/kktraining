package com.taining.exceptions;

public class PasswordTooShortExceptions extends Throwable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Exception PasswordTooShortExceptions() {
		return new Exception("password too short");
	}

}
