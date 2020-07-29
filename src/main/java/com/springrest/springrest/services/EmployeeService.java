package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Employee;


public interface EmployeeService {
	
	public List<Employee> getEmployee();
	
	public Employee getEmploye(long employeeId);
	
	public Employee addEmployee(Employee empl);

}
