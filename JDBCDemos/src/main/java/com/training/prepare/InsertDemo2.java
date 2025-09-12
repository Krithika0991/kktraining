package com.training.prepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDemo2 {

		public static void main(String[] args) {
			String url="jdbc:mysql://localhost:3306/testdb";
			String username="root";
			String password="root";
			String query = "insert into student values(?,?,?)";
					
		
			// create a connection object
			try(Connection connection = DriverManager.getConnection(url, username, password);
				//create a PreparedStatement
				PreparedStatement st = connection.prepareStatement(query);){
				st.setString(1, "kri");
		st.setInt(2,1);
		
		st.setString(3, "CSE");
		// execute the query
		boolean isInserted = st.execute();
		System.out.println("Table value inserted for student "+!isInserted);
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
	}
}

