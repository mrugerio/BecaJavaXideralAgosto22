package com.luv2code.springboot.cruddemo.dao;

import java.sql.*;
import java.util.*;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springboot.cruddemo.entity.Employee;

@Repository
public class EmployeeDAOJdbcImpl implements EmployeeDAO {

	@Autowired
	DataSource dataSource;

	Connection myConn = null;
	Statement myStmt = null;
	ResultSet myRs = null;

	@Override
	public List<Employee> findAll() {
		System.out.println("Implementación DAO con JDBC: "+ dataSource);
		
		List<Employee> listaEmpleados = new ArrayList<>();
		
		try {
			myConn = dataSource.getConnection();
			// create sql statement
			String sql = "select * from employee";
			
			myStmt = myConn.createStatement();
			
			// execute query
			myRs = myStmt.executeQuery(sql);
			
			// process result set
			while (myRs.next()) {
										
				// retrieve data from result set row
				int id = myRs.getInt("id");
				String firstName = myRs.getString("first_name");
				String lastName = myRs.getString("last_name");
				String email = myRs.getString("email");
							
				// create new student object
				Employee tempEmployee = new Employee(id, firstName, lastName, email);
							
				// add it to the list of students
				listaEmpleados.add(tempEmployee);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listaEmpleados;
	}

	@Override
	public Employee findById(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Employee theEmployee) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub

	}

}
