package com.cts.entity;


import java.util.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employees_info")
public class Employee {
	
	@Id
	private int empId;
	private String empName;
	private int empSal;
	private String empDesg;
	private Date empDOJ;
	
	@ManyToOne
	@JoinColumn(name = "department_id",referencedColumnName = "departmentId")
	@JsonBackReference
	private Department department;
	
}
