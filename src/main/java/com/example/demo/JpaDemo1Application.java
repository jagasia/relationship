package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.model.Employee;
import com.example.demo.service.DepartmentService;
import com.example.demo.service.EmployeeService;

@SpringBootApplication
public class JpaDemo1Application {
	
	public static void main(String[] args) {
		System.out.println("Hello world");
		
		
		
		SpringApplication.run(JpaDemo1Application.class, args);
		
		
	}

}
