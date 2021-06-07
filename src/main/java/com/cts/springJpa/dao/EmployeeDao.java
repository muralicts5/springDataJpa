package com.cts.springJpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.springJpa.entity.Employee;


public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}
