package com.mylearning.api_user_and_course_mgmt.springdatajpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_mgmt")
public class UserManagement {

	@Id
	@Column(name = "USER_ID")
	@GeneratedValue
	private long userId;

	@Column(name = "USER_NAME", nullable = false, unique = true)
	private String userName;

	@Column(name = "USER_PASSWORD")
	private String userPassword;
	
	@Column(name = "USER_ROLE", nullable = false)
	private String userRole;

	// No Argument Constructor
	public UserManagement() {

	}

	public UserManagement(long userId, String userName, String userPassword, String userRole) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userRole = userRole;
	}

	//Getters & Setters
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return "UserManagement [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", userRole=" + userRole + "]";
	}
}

