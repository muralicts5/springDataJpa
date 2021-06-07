package com.cts.springJpa.service;

import java.util.List;

import com.cts.springJpa.entity.Employee;

public interface EmployeeService {

	public List<Employee> getEmployees();
	public List<Employee> findByNameQuery(String name);
	public void insertEmployee(Employee employee);
}
