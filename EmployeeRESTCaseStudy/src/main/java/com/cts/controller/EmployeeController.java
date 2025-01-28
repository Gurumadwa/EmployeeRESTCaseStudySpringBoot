package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.entity.Employee;
import com.cts.exceptions.EmployeeNotFoundException;
import com.cts.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/save-employee")
	public String addEmployee(@RequestBody Employee employee) {
		 return employeeService.addEmployee(employee);
	}
	
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable("id") int empId) {
		return employeeService.deleteEmployee(empId);
	}
	
	@GetMapping("/get-emp/{id}")
	public Employee getEmployee(@PathVariable("id") int empId) throws EmployeeNotFoundException{
		return employeeService.getEmployee(empId);
	}
	
	@GetMapping("/get-emp")
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployee();
	}
	
	
	@GetMapping("/get-between-salaries/{first}/{last}")
	public List<Employee> getAllBetweenSalaries(@PathVariable("first") int initialSal,@PathVariable("last") int finalSal){
		return employeeService.getAllBetweenSalaries(initialSal,finalSal);
	}
	
	@GetMapping("/get-by-desg/{desg}")
	public List<Employee> getAllByDesignation(@PathVariable("desg") String empDesg){
		return employeeService.getAllByDesignation(empDesg);
	}
}
