package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.entities.Employee;
import com.springrest.springrest.services.CourseService;
import com.springrest.springrest.services.EmployeeService;

@RestController
public class MyController {
	
	@Autowired
	private CourseService courseService;
	@Autowired
	private EmployeeService emplService;
	
	@GetMapping("/home")
	public String home() {
		return "this is home page";
	}
	
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.courseService.getCourses();
	}
	
	@GetMapping("/akshat")
	public String myWebisteLink(){
		return "akshatsoni.com";
	}
	
	@GetMapping("/employee")
	public List<Employee> getEmployee(){
		return this.emplService.getEmployee();
	}
	
	@GetMapping("/employee/{employeeId}")
	public Employee getEmploye(@PathVariable String employeeId){
		return this.emplService.getEmploye(Long.parseLong(employeeId));
	}
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee empl){
		return this.emplService.addEmployee(empl);
	}

}
