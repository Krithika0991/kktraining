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
      TeamHead teamheadone = new GroupTwo("cts",200,"ram");
      teamheadone.showProjects();
      
      //own method
      GroupTwo grouptwo = (GroupTwo)teamhead;
      String[] crs =new String[] {"test","opp"};
      grouptwo.courseAssigned(crs);
      
	}

}
