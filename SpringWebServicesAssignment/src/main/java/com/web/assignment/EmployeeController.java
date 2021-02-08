package com.web.assignment;

import java.util.ArrayList;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Develop RESTful web services for "Employee Management System" that manages the information about employees.
 * 
 * add, search for specific, delete, find all, updating
 * GET: http://localhost:8080/employees/all
 * GET: http://localhost:8080/employees/{id}
 * JSON POST: http://localhost:8080/employees/add
 * JSON PUT: http://localhost:8080/employees/update
 * JSON POST: http://localhost:8080/employees/delete/{id}
 * 
 * @author dgarci11
 *
 */
@RestController
public class EmployeeController {

	@RequestMapping(value="/employees/all", method=RequestMethod.GET)
	public ArrayList<Employee> getAll() {
		return EmployeeRepo.getAllEmployees();
	}
	
	@RequestMapping(value="/employees/{id}", method=RequestMethod.GET)
	public Employee getOne(@PathVariable("id") int id) {
		return EmployeeRepo.getEmployee(id);
	}
	
	@RequestMapping(value="/employees/add", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Employee add(@RequestBody Employee emp) {
		return EmployeeRepo.addEmployee(emp);
	}
	
	@RequestMapping(value="/employees/update", method=RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Employee update(@RequestBody Employee emp) {
		return EmployeeRepo.updateEmployee(emp);
	}
	
	@RequestMapping(value="/employees/delete/{id}", method=RequestMethod.GET)
	public String delete(@PathVariable("id") int id) {
		return EmployeeRepo.deleteEmployee(id);
	}
}
