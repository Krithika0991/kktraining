package com.training.abstraction;

public class Branch1 extends Bank {

	@Override
	void carLoan() {
		// TODO Auto-generated method stub
		System.out.println("carloan in branch1");

	}

	@Override
	void housingLoan() {
		// TODO Auto-generated method stub
		System.out.println("houseloan in branch1");


	}

	@Override
	void eduLoad() {
		System.out.println("eduloan in branch1");

	}
	
	void payDetails() {
		System.out.println("ownmethod from bank class");

	}

}
