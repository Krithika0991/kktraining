package com.voterapp.client;

import java.util.Scanner;

import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.service.ElectionBoothServiceImpl;

public class Voter {

	public static void main(String[] args) {
		ElectionBoothServiceImpl electionbooth = new ElectionBoothServiceImpl();
		try {
			String Loaclaityname;
			Scanner sc = new Scanner(System.in);
			Loaclaityname =sc.nextLine();
			System.out.println(Loaclaityname);
			boolean locality=electionbooth.checkLocality(Loaclaityname);
			System.out.println(locality);
		} catch (LocalityNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
