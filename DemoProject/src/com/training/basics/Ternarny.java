package com.training.basics;

public class Ternarny {

	public static void main(String[] args) {
   int a=10;
   int b=20;
   String result = a>b ?"a is greater":"b is greater";
   System.out.println(result);
   //create string name as your name
   String name= "krithika";
   String results =name.equals(name)?"Welcome "+name:"Wrong Username";
   System.out.println(results);
	}

}
