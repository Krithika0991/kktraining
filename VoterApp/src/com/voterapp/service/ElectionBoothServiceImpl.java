package com.voterapp.service;

import com.voterapp.exception.InvalidVoterIdException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NotEligibleException;
import com.voterapp.exception.UnderAgeException;

public class ElectionBoothServiceImpl implements IElectionBoothService {

	@Override
  public boolean checkEligible(int age, String locality, int id) throws NotEligibleException  {
	        if( !checkAge(age)  ){
	            throw new UnderAgeException("Age must be 18 or above to be eligible.");
	        }

	        if (!checkLocality(locality)) {
	            throw new LocalityNotFoundException("Invalid locality: " + locality);
	        }

	        if (id <= 0) {
	            throw new InvalidVoterIdException("Voter ID must be a positive number.");
	        }

	        return true;
	    }
	@Override
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
	
	@Override
	public boolean checkAge(int age ) throws UnderAgeException {
		 if (age <= 0 || age < 18) {
			    throw new UnderAgeException("Age must be greater than 0 and at least 18 to be eligible.");
			}else {
	        	return true;
			}
    }
	@Override
	public boolean checkVoterId(int id) throws InvalidVoterIdException {
		// TODO Auto-generated method stub
		if(id<1000 || id >9999) {
		    throw new InvalidVoterIdException("VoterId must be greater than 1000 and greater than 9999");
		}
		return true;
	}
		
}
