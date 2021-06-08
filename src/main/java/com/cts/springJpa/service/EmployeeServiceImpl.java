package com.cts.springJpa.service;

import java.util.List;
import java.util.Optional;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.springJpa.controller.EmployeeControllerImpl;
import com.cts.springJpa.dao.EmployeeDao;
import com.cts.springJpa.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private Logger logger = LoggerFactory.getLogger(EmployeeService.class);

	@Autowired
	private EmployeeDao dao;
	
	@Override
	public List<Employee> getEmployees() {
		return dao.findAll();
	}

	@Override
	public List<Employee> findByNameQuery(String name) {
		logger.info("Inside the findByNameQuery");
		Optional<List<Employee>> employeeOptional=dao.findByNameQuery(name);
		// nullpointer exception
		logger.debug("inside the findByName: name"+name);
		List<Employee>  output=null;
			
		if(employeeOptional.isPresent() && employeeOptional.get().size()>0) {
			output= employeeOptional.get();
		}
		else {
			logger.error("inside th errr");
		}
		logger.info("exit the findByNameQuery");
		return output;
	}

	@Override
	public void insertEmployee(Employee employee) {
			dao.save(employee);
	}

}
