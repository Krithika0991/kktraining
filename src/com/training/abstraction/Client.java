package com.training.abstraction;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Bank bank =new Branch1();
  bank.eduLoad();
  bank.carLoan();
  bank.adminDetails();
  bank.housingLoan();
  
  //own method
  Branch1 branch1 =(Branch1)bank;
  branch1.payDetails();
  
  //sub branch
  bank = new SubBranch();
  bank.adminDetails();
  bank.carLoan();
  bank.eduLoad();
  bank.housingLoan();
  
  //branch2qon method call
  Branch2 branch2 = (Branch2)bank;
  branch2.loanTypes();
  branch2.adminDetails();

  //own method of sub branch
  SubBranch subbranch = (SubBranch)branch2;
  subbranch.depositTypes();
  
  
	}

}
