package com.voterapp.service;

import com.voterapp.exception.LocalityNotFoundException;

public class ElectionBoothServiceImpl implements IElectionBoothService {

	@Override
	public boolean checkEligible(int age, String locality, int id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean checkLocality(String locality) throws LocalityNotFoundException {
		 // Suppose only these localities are allowed
        String[] validLocalities = {"JP Nagar", "ABC Nagar", "Anna Nagar"};

        for (String loc : validLocalities) {
            if (loc.equalsIgnoreCase(locality)) {
                return true;
            }else {
            	throw new LocalityNotFoundException("locality not found");
            }
        }
		return false;
    }
		

}
