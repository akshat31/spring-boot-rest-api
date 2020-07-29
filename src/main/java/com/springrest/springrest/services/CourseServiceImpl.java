package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	List<Course> list;

	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(12, "ReactJs", "This cource is all about virtula dom and react"));
		list.add(new Course(13, "AngularJS", "This course is also contain typescript"));
		list.add(new Course(14, "VueJs", "This is new in market js framework"));
		list.add(new Course(15, "BackboneJS", "Old Js library for making MVC UI app"));
	}

	@Override
	public List<Course> getCourses() {
		return list;
	}

}
