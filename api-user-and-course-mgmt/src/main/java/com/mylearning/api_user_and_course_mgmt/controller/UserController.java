package com.mylearning.api_user_and_course_mgmt.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mylearning.api_user_and_course_mgmt.springdatajpa.UserManagement;
import com.mylearning.api_user_and_course_mgmt.springdatajpa.UserSpringDataJpaRepository;

@RestController
public class UserController {

	@Autowired
	private UserSpringDataJpaRepository repository;
	
	@GetMapping("/users")
	@PreAuthorize("hasAnyAuthority('ADMIN', 'NORMAL')")
	public ResponseEntity<List<UserManagement>> getAllUsers(){
		List<UserManagement> userList = repository.findAll();
		userList.forEach(user -> user.setUserPassword(null));
        return ResponseEntity.ok(userList);
	}
	
	@GetMapping("/users/{id}")
	@PreAuthorize("hasAnyAuthority('ADMIN', 'NORMAL')")
	public Optional<UserManagement> getUsersById(@PathVariable long id){
		
		if(repository.findById(id).isEmpty()) {
			throw new RuntimeException("User not found for the id ==> "+id);
		}
		return repository.findById(id);
	}
	
	//list Admin users only
	@GetMapping("/users/admins")
	@PreAuthorize("hasAnyAuthority('ADMIN', 'NORMAL')")
	public ResponseEntity<List<UserManagement>> getAdminUsers(){
		List<UserManagement> userList = repository.findByUserRole("Admin");
		userList.forEach(user -> user.setUserPassword(null));
        return ResponseEntity.ok(userList);
	}
	
	//Post Method: Create a new resource
	@PostMapping("/users")
	@PreAuthorize("hasAuthority('ADMIN')")
	public String postAUser(@RequestBody UserManagement userManagement){
		repository.save(userManagement);
		return "Resource Created";
	}
	
	//Put Method: Update if resource exists else create a new resource
	@PutMapping("/users/{id}")
	@PreAuthorize("hasAuthority('ADMIN')")
	public String putAUser(@PathVariable long id, @RequestBody UserManagement userManagement){
		repository.save(userManagement);
		return "Resource updated/created";
	}
	
}
