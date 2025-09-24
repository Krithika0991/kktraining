package com.bookapp.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.bookapp.exception.BookAppException;
import com.bookapp.model.Book;
import com.bookapp.util.DbOpenConnection;
import com.bookapp.util.Query;

public class BookServiceImplmentation implements IBookService {
	
	static Connection connection;
	static {
		connection = DbOpenConnection.openConnection();
	}
	
	@Override
	public void updateBook(Book book) {
		System.out.println(book);
		//create a PreparedStatement by using connection
		try {
			if(getBookId(book.getBookId()) != null)
			try(PreparedStatement statement = connection.prepareStatement(Query.UPDATEQUERY);){
			//set values for placeholder
			
			  statement.setString(1, book.getTitle());
			  statement.setString(2, book.getAuthor());
			  statement.setDouble(3, book.getPrice());
			  statement.setString(4, book.getCategory());
			  statement.setLong(5, book.getBookId());
			//call execute 
			statement.execute();
} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
}
		} catch (BookAppException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Void deleteBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getBookId(int id) throws BookAppException {
	    Book book = null;
	    try (PreparedStatement stmt = connection.prepareStatement(Query.SELECTQUERY)) {
	        stmt.setInt(1, id);

	        try (ResultSet rs = stmt.executeQuery()) {  
	            if (rs.next()) {
	                book = new Book(
	                    rs.getString("title"),
	                    rs.getInt("book_id"),
	                    rs.getString("author"),
	                    rs.getDouble("price"),
	                    rs.getString("category")
	                );
	            }
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return book;
	}

@Override
	public void addBook(Book book) {
		
		//create a PreparedStatement by using connection
		try(PreparedStatement statement = connection.prepareStatement(Query.INSERTQUERY);){
		//set values for placeholder
		
		  statement.setString(1, book.getTitle());
          statement.setString(2, book.getAuthor());
          statement.setDouble(3, book.getPrice());
          statement.setString(4, book.getCategory());
		//call execute 
		statement.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
@Override
public List<Book> getAllBooks() {
    List<Book> books = new ArrayList<>();
    try (PreparedStatement statement = connection.prepareStatement(Query.SELECTAll)) {
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            books.add(new Book(
                    rs.getString("title"),
                    rs.getInt("book_id"),
                    rs.getString("author"),
                    rs.getDouble("price"),
                    rs.getString("category")
                    ));
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
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
