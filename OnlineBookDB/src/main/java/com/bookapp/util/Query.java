package com.bookapp.util;

public class Query {
	public static final String INSERTQUERY=
		    "insert into book(title,author,price,category) values(?,?,?,?)";
	
	public static final String UPDATEQUERY=		  
	"update book set title=?,author=?,price=?,category=? where book_id = ?";
	
	public static final String SELECTQUERY=		  
			"select * from book where book_id = ?";
	public static final String SELECTAll=		  
			"select * from book";
}
