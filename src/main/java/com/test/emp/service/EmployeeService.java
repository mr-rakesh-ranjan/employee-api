package com.test.emp.service;

import java.util.List;

import com.test.emp.entity.Employee;

public interface EmployeeService {

	Employee addEmployee(Employee employee);

	List<Employee> getAllEmployee();

	void deleteEmployee(long employeeId);

	Employee findByEmployeeId(long employeeId);
	

}
