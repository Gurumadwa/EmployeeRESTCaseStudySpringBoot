package com.cts.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query("SELECT e FROM Employee e WHERE e.empSal BETWEEN ?1 AND ?2")
	public List<Employee> getAllBetweenSalaries(int initialSal, int finalSal);
	
	@Query("SELECT e FROM Employee e WHERE e.empDesg=?1")
	public List<Employee> getAllByDesignation(String empDesg);
}
