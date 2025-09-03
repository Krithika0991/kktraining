package com.voterapp.service;

import com.voterapp.exception.InvalidVoterIdException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NotEligibleException;
import com.voterapp.exception.UnderAgeException;

public interface IElectionBoothService {
boolean checkEligible(int age,String locality,int id) throws NotEligibleException ;
boolean checkLocality(String locality) throws LocalityNotFoundException;
boolean checkAge(int age) throws UnderAgeException;
boolean checkVoterId(int id) throws InvalidVoterIdException;
}
