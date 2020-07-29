package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Test;
import com.springrest.springrest.services.TestService;

@RestController
public class TestController {
	
	@Autowired
	private TestService testserv;
	
	@GetMapping("/test")
	public String home() {
		return "this is test page";
	}
	
	@GetMapping("/test-data")
	public List<Test> getTest() {
		return this.testserv.getTest();
	}

}
