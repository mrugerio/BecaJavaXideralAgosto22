package com.client.rest.service;

import java.util.List;
import com.client.rest.model.Employee;

public interface CustomerService {

	public List<Employee> getCustomers();

	public void saveCustomer(Employee theCustomer);

	public Employee getCustomer(int theId);

	public void deleteCustomer(int theId);
	
}
