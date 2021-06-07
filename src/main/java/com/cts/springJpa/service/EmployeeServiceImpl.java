package com.cts.springJpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.springJpa.dao.EmployeeDao;
import com.cts.springJpa.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao dao;
	
	@Override
	public List<Employee> getEmployees() {
		return dao.findAll();
	}

	@Override
	public List<Employee> findByNameQuery(String name) {
		Optional<List<Employee>> employeeOptional=dao.findByNameQuery(name);
		// nullpointer exception
			
		if(employeeOptional.isPresent()) {
			return employeeOptional.get();
		}
		else 
			return null;
		
	}

	@Override
	public void insertEmployee(Employee employee) {
			dao.save(employee);
	}

}
