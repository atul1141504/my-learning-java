package com.mylearning.springboot.my_project_jpa_and_hibernate_b.Course.jpa;

import org.springframework.stereotype.Repository;

import com.mylearning.springboot.my_project_jpa_and_hibernate_b.Course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {

	//@Autowired
	@PersistenceContext
	private EntityManager entityManager;
	
	public void insert(Course course) {
		entityManager.merge(course);
	}
	
	public Course selectById(long id) {
		return entityManager.find(Course.class , id);
	}
	
	public void deleteById(long id) {
		Course course = entityManager.find(Course.class , id);
		entityManager.remove(course);
	}
}
