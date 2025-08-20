package com.training.abstraction;

public abstract class Branch2 extends Bank {


	@Override
	void housingLoan() {
		// TODO Auto-generated method stub
		System.out.println("Housing loan in branch2");

	}

	@Override
	void eduLoad() {
		System.out.println("edu loan in branch2");
		// TODO Auto-generated method stub

	}
	
	//ownmethod 
	void loanTypes() {
		System.out.println(" loan types in branch2");
	}

}
