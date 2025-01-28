package com.cts.service;

import java.util.List;

import com.cts.entity.Employee;
import com.cts.exceptions.EmployeeNotFoundException;

public interface EmployeeService {
	public abstract String addEmployee(Employee employee);

	public abstract Employee updateEmployee(Employee employee);

	public abstract String deleteEmployee(int empId);

	public abstract Employee getEmployee(int empId) throws EmployeeNotFoundException;

	public abstract List<Employee> getAllEmployee();

	public abstract List<Employee> getAllBetweenSalaries(int initialSal, int finalSal);
	
	public abstract List<Employee> getAllByDesignation(String empDesg);
}
