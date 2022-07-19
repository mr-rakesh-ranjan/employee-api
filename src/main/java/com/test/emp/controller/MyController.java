package com.test.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.test.emp.entity.Employee;
import com.test.emp.service.EmployeeService;

@RestController
@CrossOrigin(origins = "*")
public class MyController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/home")
	public String home() {
		return "this is home page";
	}
	
	@PostMapping("/add-employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return this.employeeService.addEmployee(employee);
	}

	//list of all employee
	@GetMapping("/all-employee")
	public List<Employee> allEmployee() {
		return this.employeeService.getAllEmployee();
	}

	@GetMapping("/employee/{employeeId}")
	public Employee getEmployee(@PathVariable("employeeId")  String employeeId){
		return this.employeeService.findByEmployeeId(Long.parseLong(employeeId));
	}

	//delete employee handler
	@DeleteMapping("/employee/{employeeId}")
	public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable("employeeId") String employeeId){
		try {
			this.employeeService.deleteEmployee(Long.parseLong(employeeId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}



}
