package com.seleniumexpress.sm.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.seleniumexpress.sm.api.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate; 
	int j;
	public List<Student> loadStudents() {

		//I will write some logic to get me the studentdata from DB
		
		List<Student> studentList = new ArrayList<Student>();
		
		String sql="SELECT * FROM students";
		List<Student> listOfStudent = jdbcTemplate.query(sql, new StudentRowMapper());
		
		
		return listOfStudent;
	}

	public void saveStudent(Student student) {
		
		//write the logic to store student object into DB
		Object[] sqlParameters = {student.getName(),student.getMobile(),student.getCountry()};
		String sql="insert into students(name,mobile,country) values(?,?,?)";
		j = jdbcTemplate.update(sql, sqlParameters);
		if(j!=0)
			System.out.println("1 record inserted....");
		
		
		
	}

}
