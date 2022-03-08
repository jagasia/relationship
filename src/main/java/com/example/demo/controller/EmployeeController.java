package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		System.out.println(employee);
		return service.create(employee);
	}
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployee() {
		return service.read();
	}
	
	@GetMapping("/employee/{id}")
	public Employee findEmployeeById(@PathVariable("id") Integer id) {
		Employee e = service.read(id);
		System.out.println("Now, i am going to get department name:");
		System.out.println(e.getDepartment().getName());
		return e;
	}
	
	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return service.update(employee);
	}
	
	@DeleteMapping("/employee/{id}")
	public Employee removeEmployee(@PathVariable("id") Integer id) {
		return service.delete(id);
	}
	
	
}
