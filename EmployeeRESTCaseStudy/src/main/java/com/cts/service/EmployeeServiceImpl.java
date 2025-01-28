package com.cts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.entity.Employee;
import com.cts.exceptions.EmployeeNotFoundException;
import com.cts.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public String addEmployee(Employee employee) {

		Employee emp = employeeRepository.save(employee);

		if (emp != null) {

			return "Employee added successfully !!";
		} else {
			return "Failed to save Employee !!";
		}

	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Employee emp = employeeRepository.save(employee);

		if (emp != null) {

			return emp;
		} else {
			return null;
		}
	}

	@Override
	public String deleteEmployee(int empId) {
		employeeRepository.deleteById(empId);
		return "Employee Deleted Successfully";
	}

	@Override
	public Employee getEmployee(int empId) throws EmployeeNotFoundException {
		Optional<Employee> emp = employeeRepository.findById(empId);
		if(emp.isPresent()) {
			return emp.get();
		}else {
			throw new EmployeeNotFoundException("No Employees found !!");
		}
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return employeeRepository.findAll();
	}

	@Override
	public List<Employee> getAllBetweenSalaries(int initialSal, int finalSal) {
		
		return employeeRepository.getAllBetweenSalaries(initialSal, finalSal);
	}

	@Override
	public List<Employee> getAllByDesignation(String empDesg) {
		
		return employeeRepository.getAllByDesignation(empDesg);
	}

}
