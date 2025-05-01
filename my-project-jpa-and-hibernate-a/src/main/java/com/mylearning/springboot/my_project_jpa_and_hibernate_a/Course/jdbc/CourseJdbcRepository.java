package com.mylearning.springboot.my_project_jpa_and_hibernate_a.Course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/* @Repository Annotation enables the communication with DB
 * 
 * To execute queries using Spring JDBC is 'JdbcTemplate'  
 * 
 */
@Repository
public class CourseJdbcRepository {

	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	private static String INSERT_QUERY = 
			"""
				INSERT INTO COURSE(ID, NAME, AUTHOR) 
				VALUES(1,'PYTHON FUNDAMENTALS','PAUL JONES')
			""";
			
	public void insert() {
		springJdbcTemplate.update(INSERT_QUERY);
	}
}
