package com.training.client;

import com.taining.exceptions.UsernameExistsException;
import com.training.service.ValidationServiceImpl;

public class ClientMain {

	public static void main(String[] args) throws UsernameExistsException {
		// TODO Auto-generated method stub
		ValidationServiceImpl imp = new ValidationServiceImpl();
		boolean value = imp.validateUsername("krithika jj");
		System.out.println(value);
	}

}
