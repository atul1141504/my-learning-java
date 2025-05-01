package learn.spring.boot.a.my_project_spring_boot_a.courses.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import learn.spring.boot.a.my_project_spring_boot_a.courses.bean.Course;

@RestController
public class CourseController {

	@GetMapping("/courses")
	public List<Course> getAllCourses(){
		return Arrays.asList(new Course(1,"Learn Microservices-1","APatel"),
						     new Course(2,"Learn Spring Boot-2","AtulP"));
	}
	
}
