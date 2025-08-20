package com.training.service;

import com.taining.exceptions.PasswordTooShortExceptions;
import com.taining.exceptions.UsernameExistsException;

public class ValidationServiceImpl implements IValidationService {

	@Override
	public boolean validateUsername(String username) throws UsernameExistsException {
		// TODO Auto-generated method stub
		String[] usernames = {"krithika jj","Arun kumar"};
		System.out.println("chec" + username);
		 for (String usr : usernames) {
		        System.out.println("Comparing with: " + usr);

		        if (usr.equalsIgnoreCase(username)) {
		            throw new UsernameExistsException();
		        }
		    }

		    return true;
	}

	@Override
	public boolean validatePassword(String password) throws PasswordTooShortExceptions {
		// TODO Auto-generated method stub
		return false;
	}

}
