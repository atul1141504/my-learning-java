package com.mylearning.springboot.my_project_jpa_and_hibernate_b.Course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mylearning.springboot.my_project_jpa_and_hibernate_b.Course.Course;

/* @Repository Annotation enables the communication with DB
 * 
 * To execute queries using Spring JDBC is 'JdbcTemplate'  
 * 
 */
@Repository
public class CourseJdbcRepository {

	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	//Defining Text Block for Insert Query
	private static String INSERT_QUERY = 
			"""
				INSERT INTO COURSE(ID, NAME, AUTHOR) 
				VALUES(?, ?, ?)
			""";
	
	//Defining Text Block for Delete Query
	private static String DELETE_QUERY = 
			"""
				DELETE FROM COURSE WHERE ID = ?
			""";
	
	//Defining Text Block for Select Query
		private static String SELECT_QUERY = 
				"""
					SELECT * FROM COURSE WHERE ID = ?
				""";
			
	public void insert(Course course) {
		springJdbcTemplate.update(INSERT_QUERY, 
				course.getId(),course.getName(), course.getAuthor());
	}
	
	public void deleteById(long id) {
		springJdbcTemplate.update(DELETE_QUERY, id);
	}
	
	/*	In case of a Singleton Query we can use 'queryForObject' function
	 *  to get the result from the table.
	 *  
	 *  This function takes 3 parameters as input:
	 * 		1. SELECT_QUERY
	 * 		2. Row Mapper - to map the result set returned
	 *		3. id (Key value) 
	 *  
	 *  It returns result in a Result Set
	 *  Result Set can be mapped to the Bean(Class Object) using Row Mapper
	 *  
	 *  Since in our case the Columns present in the table & Bean has an exact.
	 *  It allows us to use 'BeanPropertyRowMapper'
	 */
	
	public Course selectById(long id) {
		return springJdbcTemplate.queryForObject(
				SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class) , id);
	}
}
