package com.cts.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cts.entity.Department;
import com.cts.repository.DepartmentRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService{
	
	private DepartmentRepository departmentRepository;

	@Override
	public Department saveDepartment(Department department) {
		
		return departmentRepository.save(department);
		
	}

	@Override
	public List<Department> getAllDepartments() {
		
		return departmentRepository.findAll();
	}

}
