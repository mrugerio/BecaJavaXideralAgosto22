package com.curso;

import java.sql.*;

public class Principal2 {

	public static void main(String[] args) throws SQLException {

		try (Connection conn = 
				DriverManager.getConnection( 
				"jdbc:mysql://localhost:3306/web_student_tracker?useSSL=false", 
				"webstudent",
				"webstudent");
			 PreparedStatement ps = 
				conn.prepareStatement("SELECT * FROM student");
			 ResultSet rs = ps.executeQuery()
			){ //FIN TRY WITH RESOURCE
				while (rs.next()) { 
					System.out.print(rs.getInt("id")); 
					System.out.println(rs.getString("first_name"));
					System.out.println(rs.getString("email"));

				}
			} 
		
	}

}
