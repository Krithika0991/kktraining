package com.oops.override;

public class Customer {

	public static void main(String[] args) {
		//super class and sub class reference
      TeamHead teamhead = new GroupOne("tcs",200,"raju");
      teamhead.showProjects();
      
      //own method
      GroupOne groupone = (GroupOne)teamhead;
      groupone.showTools();
	 
      //override class	
      teamhead = new GroupTwo("cts",200,"ram");
      teamhead.showProjects();
      
      //own method
      GroupTwo grouptwo = new GroupTwo("cts",200,"ram");
      String[] crs =new String[] {"test","opp"};
      grouptwo.courseAssigned(crs);
      
	}

}
