package com.cts.springJpa.dao;
/*
iport java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.springJpa.entity.Employee;

@Repository
public class EmployeeDaoImpl {

	
	@Autowired
	private SessionFactory sessionFactory;
	

	public Employee insertEmployee(Employee e) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		e=(Employee) session.save(e);
		session.getTransaction().commit();
		session.close();
		return e;
	}
	
	public List<Employee> getEmployees() {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		Query query=session.createQuery("from Employee");
		List<Employee> employees=query.list();
		session.getTransaction().commit();
		session.close();
		return employees;
	}
	
}*/
