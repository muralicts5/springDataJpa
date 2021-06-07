package com.cts.springJpa.controller;

import java.util.List;

import com.cts.springJpa.entity.Employee;

public interface EmployeeController {

	void sayHello();
	
	void insertEmployee(Employee employee);
	
	 List<Employee> getEmployees();
	 
	 List<Employee> findByNameQuery(String name);

}
