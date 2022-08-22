package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.model.Employee;

public interface CustomerService {

	public List<Employee> getCustomers();

	public void saveCustomer(Employee theCustomer);

	public Employee getCustomer(int theId);

	public void deleteCustomer(int theId);
	
}
