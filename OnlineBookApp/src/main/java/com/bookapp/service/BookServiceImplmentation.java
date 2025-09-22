package com.bookapp.service;

import java.util.Arrays;
import java.util.List;

import com.bookapp.exception.BookAppException;
import com.bookapp.model.Book;

public class BookServiceImplmentation implements IBookService {

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		List<Book> books =Arrays.asList(
				  new Book("Java in Action",1, "David", 2000,"Tech"),
				  new Book("Java in Action",1, "David", 2000,"Tech"),
				  new Book("Java in Action",1, "David", 2000,"Tech"),
				  new Book("Java in Action",1, "David", 2000,"Tech"),
				  new Book("Java in Action",1, "David", 2000,"Tech") );  
		return books;
	}

	@Override
	public List<Book> getByAuthor(String author) throws BookAppException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getByCategoryLessPrice(String category, double price) throws BookAppException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getById(int bookId) throws BookAppException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getByTitleContains(String title) throws BookAppException {
		// TODO Auto-generated method stub
		return null;
	}

}
