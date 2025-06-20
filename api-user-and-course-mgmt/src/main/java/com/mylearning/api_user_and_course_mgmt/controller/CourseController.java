package com.mylearning.api_user_and_course_mgmt.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mylearning.api_user_and_course_mgmt.springdatajpa.CourseSpringDataJpaRepository;
import com.mylearning.api_user_and_course_mgmt.springdatajpa.CourseManagement;

@RestController
public class CourseController {

	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@GetMapping("/courses")
	@PreAuthorize("hasAnyAuthority('ADMIN', 'NORMAL')")
	public List<CourseManagement> getAllCourses(){
		return repository.findAll();
	}
	
	@GetMapping("/courses/{id}")
	@PreAuthorize("hasAnyAuthority('ADMIN', 'NORMAL')")
	public Optional<CourseManagement> getCourseById(@PathVariable long id){
		
		if(repository.findById(id).isEmpty()) {
			throw new RuntimeException("Course not found for the id ==> "+id);
		}
		return repository.findById(id);
	}
	
	//list Admin users only
	@GetMapping("/courses/{courseName}")
	@PreAuthorize("hasAnyAuthority('ADMIN', 'NORMAL')")
	public Optional<CourseManagement> getCoursesByCourseName(@PathVariable String courseName){
		return repository.findByCourseName(courseName);
	}
	
	//Post Method: Create a new resource
	@PostMapping("/courses")
	@PreAuthorize("hasAuthority('ADMIN')")
	public String postACourses(@RequestBody CourseManagement courseManagement){
		repository.save(courseManagement);
		return "Resource Created";
	}
	
	//Put Method: Update if resource exists else create a new resource
	@PutMapping("/courses/{id}")
	@PreAuthorize("hasAuthority('ADMIN')")
	public String putACourses(@PathVariable long id, @RequestBody CourseManagement courseManagement){
		repository.save(courseManagement);
		return "Resource updated/created";
	}
	
}