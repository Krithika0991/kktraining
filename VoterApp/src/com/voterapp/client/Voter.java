package com.voterapp.client;

import java.util.Scanner;

import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.UnderAgeException;
import com.voterapp.service.ElectionBoothServiceImpl;

public class Voter {

	    public static void main(String[] args) {
	        ElectionBoothServiceImpl electionbooth = new ElectionBoothServiceImpl();
	        Scanner sc = new Scanner(System.in);

	        try {
	            System.out.print("Enter locality: ");
	            String localityName = sc.nextLine();

	            if (electionbooth.checkLocality(localityName)) {
	                System.out.println("Valid locality: " + localityName);
	            }

	            System.out.print("Enter age: ");
	            int age = sc.nextInt();

	            if (electionbooth.checkAge(age)) {
	                System.out.println("Valid age: " + age);
	            }

	        } catch (LocalityNotFoundException e) {
	            System.out.println("Locality error: " + e.getMessage());
	        } catch (UnderAgeException e) {
	            System.out.println("Age error: " + e.getMessage());
	        } finally {
	            sc.close();
	        }
	    }
	}

