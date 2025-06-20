package com.mylearning.api_user_and_course_mgmt.springdatajpa;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<CourseManagement, Long>{

	Optional<CourseManagement> findById(Long courseId);
	Optional<CourseManagement> findByCourseName(String courseName);
	Optional<CourseManagement> findByCourseAssignee(String courseAssignee);
	Optional<CourseManagement> findByCourseStatus(String courseStatus);
}