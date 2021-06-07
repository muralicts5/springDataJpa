package com.cts.springJpa.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cts.springJpa.entity.Employee;


public interface EmployeeDao extends JpaRepository<Employee, Integer>{
	
	
	// JPQL or Native Query --> sql
	@Query("from Employee where name=:name")
	Optional<List<Employee>> findByNameQuery(@Param(value = "name") String name);



}
