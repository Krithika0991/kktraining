package com.streams.app;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class MobileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Mobile> mobiles =  Arrays.asList(
	            new Mobile("s24","Samsung", 10000.00,1),
	            new Mobile("15","iphone", 129999.00,2),
	            new Mobile("A5","htc", 59999.00,3),
	            new Mobile("A1","Samsung", 39999.00,4),
	            new Mobile("14","iphone", 150000.00,5)
	        );
		System.out.println("Display the Mobile objects:");
		mobiles.stream().forEach(System.out::println);
		System.out.println();
		System.out.println("Display the Mobile objects by brand:");
		mobiles.stream().filter(str->str.getBrand().contains("iphone")).forEach(System.out::println);
		
		System.out.println();
		System.out.println("Display the Mobile objects by sorting:");
		mobiles.stream().filter(str->str.getBrand().contains("Samsung"))
		//.sorted(Comparator.comparing(Mobile::getModel))
		.sorted((s1,s2)->s1.compareTo(s2))
				.forEach(System.out::println);
		
		System.out.println();
        System.out.println("Display the Mobile objects by brand:");
		mobiles.stream().filter(str->str.getMobileid()==4).forEach(System.out::println);
		
		
	}

}
