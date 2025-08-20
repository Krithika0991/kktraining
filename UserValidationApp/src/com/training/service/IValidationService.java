package com.training.service;

import com.taining.exceptions.PasswordTooShortExceptions;
import com.taining.exceptions.UsernameExistsException;

public interface IValidationService {

	boolean validateUsername(String username) throws UsernameExistsException;
	boolean validatePassword(String password) throws PasswordTooShortExceptions;
}
