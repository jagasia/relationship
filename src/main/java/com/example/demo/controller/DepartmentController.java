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

import com.example.demo.model.Department;
import com.example.demo.service.DepartmentService;

@RestController
public class DepartmentController {
	@Autowired
	private DepartmentService service;
	
	@PostMapping("/department")
	public Department addDepartment(@RequestBody Department department) {
		return service.create(department);
	}
	
	@GetMapping("/department")
	public List<Department> getAllDepartment() {
		return service.read();
	}
	
	@GetMapping("/department/{id}")
	public Department findDepartmentById(@PathVariable("id") Integer id) {
		return service.read(id);
	}
	
	@PutMapping("/department")
	public Department updateDepartment(@RequestBody Department department) {
		return service.update(department);
	}
	
	@DeleteMapping("/department/{id}")
	public Department removeDepartment(@PathVariable("id") Integer id) {
		return service.delete(id);
	}
	
	
}
