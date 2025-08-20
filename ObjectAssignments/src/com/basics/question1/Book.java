package com.basics.question1;

public class Book {
String author;
String title;
int price;
String category;

Book(String author,String title,int price,String category){
	this.author =author;
	this.title=title;
	this.price=price;
	this.category=category;
}

void checkBookType(int price) {
	String category =price>500?"premium books":"standard books";
		System.out.println(category);
	}
void getDetails() {
	System.out.println("author name :"+author);
	System.out.println("title name :"+title);
	System.out.println("price name :"+price);
	System.out.println("category name :"+category);
}
}
