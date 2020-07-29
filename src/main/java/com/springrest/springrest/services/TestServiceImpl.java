package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Test;

@Service
public class TestServiceImpl implements TestService {
	
	List<Test> testdata;
	
	

	public TestServiceImpl() {
		testdata = new ArrayList<>();
		testdata.add(new Test(200, "test data one"));
		testdata.add(new Test(201, "test data two"));
		testdata.add(new Test(202, "test data three"));
		testdata.add(new Test(203, "test data four"));
		testdata.add(new Test(204, "test data five"));
	}



	@Override
	public List<Test> getTest() {
		// TODO Auto-generated method stub
		return testdata;
	}

}
