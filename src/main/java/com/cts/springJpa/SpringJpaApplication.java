package com.cts.springJpa;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.cts.springJpa.controller.EmployeeController;
import com.cts.springJpa.dao.EmployeeDao;
import com.cts.springJpa.entity.Employee;

@SpringBootApplication 
public class SpringJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringJpaApplication.class, args);
		EmployeeController controller=(EmployeeController) context.getBean("employeeController");
		Employee emp=new Employee();
		emp.setName("Ramesh");
		emp.setAddress("Bangalore");
		emp.setDob(new Date());
		
		controller.insertEmployee(emp);
		
		List <Employee> employees=controller.findByNameQuery("Ram");
		System.out.println(employees);	
	}
	
	

	 @Bean
		public CommandLineRunner commandLineRunner(ApplicationContext ctx){
			return (args) -> {
				System.out.println("ctx.getBeanDefinitionCount()"+ctx.getBeanDefinitionCount());	
						Arrays.stream(ctx.getBeanDefinitionNames())
						.sorted()
						.forEach(name->System.out.println(name));
			
			};
	 }
}
