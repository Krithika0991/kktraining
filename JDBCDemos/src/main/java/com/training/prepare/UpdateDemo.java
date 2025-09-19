package com.training.prepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDemo {

		public static void main(String[] args) {
			String url="jdbc:mysql://localhost:3306/testdb";
			String username="root";
			String password="root";
			String query = "update student set department=? where student_id=?";
					
		
			// create a connection object
			try(Connection connection = DriverManager.getConnection(url, username, password);
				//create a PreparedStatement
				PreparedStatement st = connection.prepareStatement(query);){
				st.setString(1, "HR");
		        st.setInt(2,1);
		// execute the query
		boolean isUpdated = st.execute();
		System.out.println("Table value updated for student "+!isUpdated);
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
	}
}

