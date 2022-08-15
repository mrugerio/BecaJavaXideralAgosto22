package com.curso;

import java.sql.*;

public class Principal {

	public static void main(String[] args) throws SQLException {

		try (Connection conn = 
				DriverManager.getConnection( 
				"jdbc:mysql://localhost:3306/web_student_tracker?useSSL=false", 
				"webstudent",
				"webstudent")
			) {
				System.out.println(conn); 
			} 
		
	}

}
