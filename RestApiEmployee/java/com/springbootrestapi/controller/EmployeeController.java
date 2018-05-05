/**
 * 
 */
package com.springbootrestapi.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootrestapi.dao.EmployeeDao;
import com.springbootrestapi.model.Employee;

/**
 * @author Jorge
 *
 */
@RestController
@RequestMapping("/company")
public class EmployeeController {

	@Autowired
	private EmployeeDao employeeDao;
	
	
	
	// to save an employee to database
	@PostMapping("/employees")
	public Employee createEmployee (@Valid @RequestBody Employee emp) {
		return employeeDao.save(emp);
	}
	
	// to get all employees
	@GetMapping("/employees")
	public List<Employee> getAllEmployees () {
		return employeeDao.findAll();
	}
	
	// to get employee by empId 
	@GetMapping("/employees/{id}")
	public ResponseEntity<Optional<Employee>> getEmployeeById(@PathVariable(value="id") Long empId){
		
		Optional<Employee> emp = employeeDao.findOne(empId);
		
		if (emp == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(emp);		
	}
	
	// to get employee by expertise 
	@GetMapping("/employees/expertise/{expertise}")
	public List<Employee> getEmployeeByExpertise(@PathVariable(value="expertise") String expertise){
		
		return employeeDao.findByExpertise(expertise);
		
		// return ResponseEntity.ok().body(emp);		
	}
	
	// to update employee by empId
	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmployeeById (@PathVariable(value="id") Long empId, @Valid @RequestBody Employee empDetails){
		
/*		Employee emp = employeeDao.findOne(empId);
		
		if (emp == null) {
			return ResponseEntity.notFound().build();
		}
*/
		Employee employee = new Employee();

		employee.setId(empId);
		employee.setName(empDetails.getName());
		employee.setDesignation(empDetails.getDesignation());
		employee.setExpertise(empDetails.getExpertise());
		
		return ResponseEntity.ok(employeeDao.save(employee));
			
	} 
	
	// to delete an employee by empId
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Optional<Employee>> deleteEmployeeById (@PathVariable(value="id") Long empId){

		Optional<Employee> emp = employeeDao.findOne(empId);
		

		if (emp == null) {
			return ResponseEntity.notFound().build();
		}

		employeeDao.deleteOne(empId);
		
		return ResponseEntity.ok().build();
		
		
	}

	
}
