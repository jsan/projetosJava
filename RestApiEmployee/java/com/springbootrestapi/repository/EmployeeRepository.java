package com.springbootrestapi.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springbootrestapi.model.Employee;


public interface EmployeeRepository extends JpaRepository <Employee, Long> {
	
	
	@Query("SELECT e FROM Employee e WHERE e.expertise LIKE %:expertise%") 
	List<Employee> findByExpertise(@Param("expertise") String expertise);

}
