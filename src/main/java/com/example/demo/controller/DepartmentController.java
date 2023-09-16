package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.DepartmentRepository;
import com.example.demo.model.Department;

@RestController
public class DepartmentController {
	
	@Autowired
	DepartmentRepository deptRepo;
	 
	@GetMapping("/getAllDepartments")
	public List<Department> getAllDepartments() {
		return deptRepo.findAll();
	}
	
	@PostMapping("/saveDepartment")
	public String saveDepartment(@RequestBody Department dept) {
		deptRepo.save(dept);		
		return "Department Saved....";
	}

}
