package com.test.emp.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.test.emp.entity.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface EmployeeDao extends JpaRepository<Employee, Long> {

    public void removeEmployeeByEmployeeId(long empId);
    @Query("select u from Employee u where u.employeeId = :e")
    public Employee findById(@Param("e") long employeeId);

    @Query("select e from Employee e")
    public Page<Employee> findAllEmployee(Pageable pePageable);

}
