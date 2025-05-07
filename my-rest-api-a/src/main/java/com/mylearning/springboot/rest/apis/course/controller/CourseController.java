package com.mylearning.springboot.rest.apis.course.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mylearning.springboot.rest.apis.course.springdatajpa.Course;
import com.mylearning.springboot.rest.apis.course.springdatajpa.CourseSpringDataJpaRepository;

@RestController
public class CourseController {

	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@GetMapping("/courses")
	public List<Course> getAllCourses(){
		return repository.findAll();
	}
	
	@GetMapping("/courses/{id}")
	public Optional<Course> getCourseById(@PathVariable long id){
		
		if(repository.findById(id).isEmpty()) {
			throw new RuntimeException("Course not found for the id ==> "+id);
		}
		return repository.findById(id);
	}
	
	//Post Method: Create a new resource
	@PostMapping("/courses")
	public String postACourse(@RequestBody Course course){
		
		repository.save(course);
		return "Resource Created";
	}
	
	//Put Method: Update if resource exists else create a new resource
	@PutMapping("/courses/{id}")
	public String putACourse(@PathVariable long id, @RequestBody Course course){
		repository.save(course);
		return "Resource updated/created";
	}
	
}
