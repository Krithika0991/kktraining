package com.bookapp.service;

import java.util.List;

import com.bookapp.exception.BookAppException;
import com.bookapp.model.Book;
public interface IBookService {
	
	
	   List<Book> getAllBooks();
	   List<Book> getByAuthor(String author) throws BookAppException;
	   List<Book> getByCategoryLessPrice(String category, double price) throws BookAppException;
	   Book getById(int bookId) throws BookAppException;
	   List<Book> getByTitleContains(String title) throws BookAppException;

}
