package com.mylearning.springboot.my_project_jpa_and_hibernate_b.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.mylearning.springboot.my_project_jpa_and_hibernate_b.Course.jpa.CourseJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

	@Autowired
	private CourseJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.insert(
				new Course(1, "Python Fundamentals I","Paul Jones I"));
		
		repository.insert(
				new Course(2, "Python Fundamentals II","Paul Jones II"));
		
		repository.insert(
				new Course(3, "Python Fundamentals III","Paul Jones III"));
		
		repository.deleteById(1);
		
		System.out.println(repository.selectById(2));
		System.out.println(repository.selectById(3));
	}

}
