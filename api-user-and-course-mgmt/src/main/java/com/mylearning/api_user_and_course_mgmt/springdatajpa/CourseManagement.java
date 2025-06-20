package com.mylearning.api_user_and_course_mgmt.springdatajpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "COURSE_MGMT")
public class CourseManagement {

	@Id
	@Column(name = "COURSE_ID")
	@GeneratedValue
	private long courseId;

	@Column(name = "COURSE_NAME", nullable = false, unique = true)
	private String courseName;

	@Column(name = "COURSE_ASSIGNEE")
	private String courseAssignee;
	
	@Column(name = "COURSE_STATUS", nullable = false)
	private String courseStatus;

	// No Argument Constructor
	public CourseManagement() {

	}

	public CourseManagement(long courseId, String courseName, String courseAssignee, String courseStatus) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseAssignee = courseAssignee;
		this.courseStatus = courseStatus;
	}

	//Getters & Setters
	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseAsignee() {
		return courseAssignee;
	}

	public void setCourseAsignee(String courseAsignee) {
		this.courseAssignee = courseAsignee;
	}

	public String getCourseStatus() {
		return courseStatus;
	}

	public void setCourseStatus(String courseStatus) {
		this.courseStatus = courseStatus;
	}

	@Override
	public String toString() {
		return "CourseManagement [CourseId=" + courseId + ", courseName=" + courseName + ", courseAsignee="
				+ courseAssignee + ", courseStatus=" + courseStatus + "]";
	}	

}
