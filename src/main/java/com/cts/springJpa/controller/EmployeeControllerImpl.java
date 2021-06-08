package com.cts.springJpa.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cts.springJpa.entity.Employee;
import com.cts.springJpa.service.EmployeeService;


@Controller("employeeController")
public class EmployeeControllerImpl implements EmployeeController{

	
	@Autowired
	private EmployeeService employeeService;
	
	@Override
	public void sayHello() {
System.out.println("Hello");		
	}

	@Override
	public List<Employee> getEmployees() {
		return employeeService.getEmployees();
	}

	
	public List<Employee> findByNameQuery(String name) {
		return employeeService.findByNameQuery("ramesh");

	}

	@Override
	public void insertEmployee(Employee employee) {
		 employeeService.insertEmployee(employee);

	}

}
