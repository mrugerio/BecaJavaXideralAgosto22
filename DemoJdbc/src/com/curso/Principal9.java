package com.curso;

import java.sql.*;

public class Principal9 {

	public static void main(String[] args) throws SQLException {
		try (Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/web_student_tracker?useSSL=false", 
					"webstudent", 
					"webstudent")){ 
			register(conn,14,"Patrobas","Tercio","paco@gmail.com");		
		}
	}

	public static void register(Connection conn, int key, String firstName, String lastName, String email) throws SQLException {
		String sql = 
			"INSERT INTO student VALUES(?,?,?,?)"; 
		try (PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, key);
			ps.setString(2, firstName);
			ps.setString(3, lastName);
			ps.setString(4, email);
			ps.executeUpdate();
		}
	}

}
