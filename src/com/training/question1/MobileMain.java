package com.training.question1;

public class MobileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Mobile mobile =new Mobile("A5",15000,"samsung");
		   mobile.getDetails();
		   String[] features = mobile.showFeatures("A5",15000,"samsung");
		   for (String feature:features) {
System.out.println("Features: "+feature);
		   }
	}

}
