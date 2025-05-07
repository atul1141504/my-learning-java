package com.mylearning.springboot.my_project_jpa_and_hibernate_b.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.mylearning.springboot.my_project_jpa_and_hibernate_b.Course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		//for Spring Data JPA the Insert is done using save function
		repository.save(new Course(1, "Python Fundamentals I","Paul Jones I"));
		repository.save(new Course(2, "Python Fundamentals II","Paul Jones II"));
		repository.save(new Course(3, "Python Fundamentals III","Paul Jones III"));
		
		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
		//Calling the custom functions/methods
		System.out.println(repository.findByAuthor("Paul Jones II"));
		System.out.println(repository.findByAuthor("Paul Jones III"));
		
		System.out.println(repository.findByName("Python Fundamentals II"));
		System.out.println(repository.findByName("Python Fundamentals III"));
		
	}

}
