package com.bookapp.client;


import java.util.List;
import java.util.Scanner;

import com.bookapp.exception.BookAppException;
import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImplmentation;

public class OnlineBookMain {

	public static void main(String[] args) {
		BookServiceImplmentation bookserviceimp= new BookServiceImplmentation();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter title:");
		String title =sc.next();
		bookserviceimp.addBook(new Book(title, 0, "Kathy", 700, "Techi"));
		
		try {
		Book book=	bookserviceimp.getBookId(9);
		bookserviceimp.updateBook(new Book("wonder women", book.getBookId(), "Kathy", 700, "Techi"));
		System.out.println(book);
		} catch (BookAppException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Get all the records for books");
		List<Book> books=bookserviceimp.getAllBooks();
		System.out.println(books);
		}
	}
