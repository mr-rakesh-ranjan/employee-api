package com.test.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.emp.dao.EmployeeDao;
import com.test.emp.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Employee addEmployee(Employee employee) {
		employeeDao.save(employee);
		return employee;
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeDao.findAll();	
	}

	@Override
	public void deleteEmployee(long employeeId) {
		Employee emp = this.employeeDao.findById(employeeId);
		this.employeeDao.delete(emp);
	}

	@Override
	public Employee findByEmployeeId(long employeeId) {
		return this.employeeDao.findById(employeeId);
	}

}
