package com.mylearning.springboot.my_project_jpa_and_hibernate_b.Course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mylearning.springboot.my_project_jpa_and_hibernate_b.Course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long>{

	List<Course> findByAuthor(String author);
	List<Course> findByName(String name);
}
