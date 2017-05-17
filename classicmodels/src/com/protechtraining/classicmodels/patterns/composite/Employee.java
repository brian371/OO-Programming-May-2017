package com.protechtraining.classicmodels.patterns.composite;

import java.util.List;

public class Employee {
	private int employeeNumber;
	private String lastName;
	private String firstName;
	private String extension;
	private String email;
	private int officeCode;
	public List<Employee> subordinates;
	private String jobTitle;
	private int customerRepCount;
	
	
	public Employee() {
		super();
	}
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getOfficeCode() {
		return officeCode;
	}
	public void setOfficeCode(int officeCode) {
		this.officeCode = officeCode;
	}
	public List<Employee> getSubordinates() {
		return subordinates;
	}
	public void setSubordinates(List<Employee> subordinates) {
		this.subordinates = subordinates;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public int getCustomerRepCount() {
		int count;
		if (subordinates == null || subordinates.size() == 0) {
			count = customerRepCount;			
		} else {
			count = 0;
			for (Employee e: subordinates) {
				count += e.getCustomerRepCount();
			}
		}
		return count;
	}
	@Override
	public String toString() {
		return "Employee [employeeNumber=" + employeeNumber + ", lastName="
				+ lastName + ", firstName=" + firstName + ", extension="
				+ extension + ", email=" + email + ", officeCode=" + officeCode
				+ ", subordinates=" + subordinates + ", jobTitle=" + jobTitle
				+ "]";
	}
}
