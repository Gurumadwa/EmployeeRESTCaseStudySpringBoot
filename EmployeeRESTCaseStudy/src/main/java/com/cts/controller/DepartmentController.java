package com.cts.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.entity.Department;
import com.cts.service.DepartmentService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class DepartmentController {
	
	private DepartmentService departmentService;
	
	@PostMapping("/save-department")
	public Department saveDepartment(@RequestBody Department department) {
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/getAll")
	public List<Department> getAllDepartments() {
		return departmentService.getAllDepartments();
	}
}
