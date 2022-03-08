package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Department;
import com.example.demo.repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository dr;
	
	public Department create(Department department) {
		return dr.save(department);
	}
	
	public List<Department> read() {
		return dr.findAll();
	}
	
	public Department read(Integer id) {
		Optional<Department> x = dr.findById(id);
		Department e=null;
		if(x.isPresent())
		{
			e= x.get();
		}
		return e;
	}
	
	public Department update(Department department) {
		return dr.save(department);		
	}
	
	public Department delete(Integer id) {
		Optional<Department> x = dr.findById(id);
		Department e=null;
		if(x.isPresent())
		{
			e=x.get();
			dr.delete(e);
		}
		return e;
	}	
	
}
