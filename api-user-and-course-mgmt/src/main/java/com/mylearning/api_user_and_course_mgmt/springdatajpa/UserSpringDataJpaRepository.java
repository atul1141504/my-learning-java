package com.mylearning.api_user_and_course_mgmt.springdatajpa;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSpringDataJpaRepository extends JpaRepository<UserManagement, Long>{
	Optional<UserManagement> findById(Long userId);
	Optional<UserManagement> findByUserName(String userName);
	List<UserManagement> findByUserRole(String userRole);
}