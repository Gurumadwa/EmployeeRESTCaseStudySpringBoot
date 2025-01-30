package com.cts.service;

import java.util.List;

import com.cts.entity.Department;

public interface DepartmentService {
	
	public Department saveDepartment(Department department);

	public List<Department> getAllDepartments();

}
