package com.bookapp.client;

import java.util.List;

import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImplmentation;

public class OnlineBookMain {

	public static void main(String[] args) {
		BookServiceImplmentation bookserviceimp= new BookServiceImplmentation();
		List<Book> book=bookserviceimp.getAllBooks();
		for(Book book1 : book) {
		System.out.println(book1);
		}
		}
	}
