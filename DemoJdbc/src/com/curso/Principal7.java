package com.curso;

import java.sql.*;

public class Principal7 {

	public static void main(String[] args) throws SQLException {
		try (Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/web_student_tracker?useSSL=false", 
					"webstudent", 
					"webstudent")){ 
			register(conn,"paco@gmail.com");		
		}
	}

	public static void register(Connection conn,String email) throws SQLException {
		String sql = 
			"INSERT INTO student VALUES(11, 'Paco','Paco','"+email+"')";
		try (PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.executeUpdate();
		}
	}

}
