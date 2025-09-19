package com.training.prepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultSetDemo {

		public static void main(String[] args) {
			String url="jdbc:mysql://localhost:3306/testdb";
			String username="root";
			String password="root";
			String query = "select * from student";
					

			// create a connection object
			try(Connection connection = DriverManager.getConnection(url, username, password);
				//create a PreparedStatement
				PreparedStatement st = connection.prepareStatement(query);){
		// execute the query
		ResultSet rs = st.executeQuery();
		while (rs.next()) {
			String name=rs.getString("student_name");
			int id = rs.getInt("student_id");
			System.out.println(" student name: "+name +"\t id:"+id);

		}	
			}catch(SQLException e) {
				e.printStackTrace();
			}
	}
}

