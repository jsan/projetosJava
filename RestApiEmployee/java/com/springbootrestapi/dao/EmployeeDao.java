package com.springbootrestapi.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootrestapi.model.Employee;
import com.springbootrestapi.repository.EmployeeRepository;

@Service
public class EmployeeDao {

	@Autowired
	EmployeeRepository employeeRepository;
	
	// To save an employee
	public Employee save(Employee emp) {
		return employeeRepository.save(emp);
		
	}

	 
	// To search all employees
	public List <Employee> findAll(){
		return employeeRepository.findAll();
	}
	

	// To get an employee by id
	public Optional<Employee> findOne (Long empId) {
		return employeeRepository.findById(empId);
			
	}
	
	// To get an employee by expertise
	public List<Employee> findByExpertise (String expertise) {
		return employeeRepository.findByExpertise(expertise);		
		
	}

	// To delete an employee by object
	public void deleteOne(Long emp) {
		employeeRepository.deleteById(emp);
	}

}
