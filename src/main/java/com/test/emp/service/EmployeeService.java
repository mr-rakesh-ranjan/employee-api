package com.test.emp.service;

import java.util.List;

import com.test.emp.entity.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);

	public List<Employee> getAllEmployee();

	public void deleteEmployee(long employeeId);

	public Employee findByEmployeeId(long employeeId);
	

}
