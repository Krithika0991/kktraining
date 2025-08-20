package com.training.question1;

public class Mobile {
	
public Mobile(String model, double price, String brand) {
		super();
		this.model = model;
		this.price = price;
		this.brand = brand;
	}
String model;
double price;
String brand;

void getDetails() {
	System.out.println("Model :"+model);
	System.out.println("Price :"+price);
	System.out.println("Brand :"+brand);
}
}
