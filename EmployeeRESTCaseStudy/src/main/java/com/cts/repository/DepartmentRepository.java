package com.cts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
