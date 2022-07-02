package com.test.emp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long employeeId;
	private String employeeEmail;
	private String employeeName;
	private String employeeDesignation;
	private String employeeTeam;
	private String employeeAddress;
	private String employeeCity;
	private String employeeState;
	private String employeeZip;
	
	public Employee(long employeeId, String employeeEmail, String employeeName, String employeeDesignation,
			String employeeTeam, String employeeAddress, String employeeCity, String employeeState,
			String employeeZip) {
		super();
		this.employeeId = employeeId;
		this.employeeEmail = employeeEmail;
		this.employeeName = employeeName;
		this.employeeDesignation = employeeDesignation;
		this.employeeTeam = employeeTeam;
		this.employeeAddress = employeeAddress;
		this.employeeCity = employeeCity;
		this.employeeState = employeeState;
		this.employeeZip = employeeZip;
	}

	public Employee() {
		super();
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public String getEmployeeTeam() {
		return employeeTeam;
	}

	public void setEmployeeTeam(String employeeTeam) {
		this.employeeTeam = employeeTeam;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public String getEmployeeCity() {
		return employeeCity;
	}

	public void setEmployeeCity(String employeeCity) {
		this.employeeCity = employeeCity;
	}

	public String getEmployeeState() {
		return employeeState;
	}

	public void setEmployeeState(String employeeState) {
		this.employeeState = employeeState;
	}

	public String getEmployeeZip() {
		return employeeZip;
	}

	public void setEmployeeZip(String employeeZip) {
		this.employeeZip = employeeZip;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeEmail=" + employeeEmail + ", employeeName="
				+ employeeName + ", employeeDesignation=" + employeeDesignation + ", employeeTeam=" + employeeTeam
				+ ", employeeAddress=" + employeeAddress + ", employeeCity=" + employeeCity + ", employeeState="
				+ employeeState + ", employeeZip=" + employeeZip + "]";
	}
	
	
	
	
	
	

}
