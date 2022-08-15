package com.curso;

import java.sql.*;

public class Principal6 {

	public static void main(String[] args) throws SQLException {

		try (Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/web_student_tracker?useSSL=false", 
					"webstudent", 
					"webstudent")){ 
			register(conn);		
		}

	}

	public static void register(Connection conn) throws SQLException {
		String sql = "INSERT INTO student VALUES(11, 'Paco','Paco','pago@gmail.com')";
		try (PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.executeUpdate();
		}
	}

}
