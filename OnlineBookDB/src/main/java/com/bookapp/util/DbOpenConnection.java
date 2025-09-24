package com.bookapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbOpenConnection {
	static Connection connection;
	 // Open a connection
    public static Connection openConnection() {
		String url="jdbc:mysql://localhost:3306/testdb";
		String username="root";
		String password="root";
        try {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(url, username, password);
                System.out.println("Database connected");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
//	public static Connection OpenConnection() {
//		String url="jdbc:mysql://localhost:3306/testdb";
//		String username="root";
//		String password="root";
//		String query = """
//				create table book(book_name varchar(20),
//				book_id int primary key auto_increment,author varchar(20),price float)
//				""";
//
//		// create a connection object
//			try
//			{
//				connection = DriverManager.getConnection(url, username, password);
//				//create a PreparedStatement
//				PreparedStatement st = connection.prepareStatement(query);
//				// execute the query
//				boolean isCreated = st.execute();
//				System.out.println("Table created "+!isCreated);
//				
//			}catch(SQLException e) {
//				e.printStackTrace();	
//			}
//			return connection;
//	
//}
	public static void CloseConnection() {
		try {
			if (connection != null)
				connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
