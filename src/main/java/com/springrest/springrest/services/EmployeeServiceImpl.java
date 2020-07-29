package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Employee;

@Service("employee")
public class EmployeeServiceImpl implements EmployeeService {
	
	List<Employee> empl;

	public EmployeeServiceImpl() {
		empl = new ArrayList<>();
		empl.add(new Employee(001, "akshat soni", "FrontEnd"));
		empl.add(new Employee(002, "swagtika mohapatra", "BackEnd"));
		empl.add(new Employee(003, "pritam kumar", "DevOps"));
		empl.add(new Employee(004, "athif alam", "DataBase"));
	}

	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return empl;
	}

	@Override
	public Employee getEmploye(long employeeId) {
		
		Employee e = null;
		for (Employee oneEmpl: empl) {
			if (oneEmpl.getId() == employeeId) {
				e = oneEmpl;
				break;
			}
		}
		
		return e;
	}

	@Override
	public Employee addEmployee(Employee addempl) {
		empl.add(addempl);
		return addempl;
	}

}
