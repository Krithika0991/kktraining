package com.voterapp.service;

import com.voterapp.exception.LocalityNotFoundException;

public interface IElectionBoothService {
boolean checkEligible(int age,String locality,int id) ;
boolean checkLocality(String locality) throws LocalityNotFoundException;
;
}
