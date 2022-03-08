package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository er;
	
	public Employee create(Employee employee) {
		return er.save(employee);
	}
	
	public List<Employee> read() {
		return er.findAll();
	}
	
	public Employee read(Integer id) {
		Optional<Employee> x = er.findById(id);
		Employee e=null;
		if(x.isPresent())
		{
			e= x.get();
		}
		return e;
	}
	
	public Employee update(Employee employee) {
		return er.save(employee);		
	}
	
	public Employee delete(Integer id) {
		Optional<Employee> x = er.findById(id);
		Employee e=null;
		if(x.isPresent())
		{
			e=x.get();
			er.delete(e);
		}
		return e;
	}	
	
}
