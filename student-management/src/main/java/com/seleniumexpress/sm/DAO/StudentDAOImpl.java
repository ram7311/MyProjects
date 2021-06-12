package com.seleniumexpress.sm.DAO;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.seleniumexpress.sm.api.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {
	
	static final Logger LOG = LogManager.getLogger(StudentDAOImpl.class);
	
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
		LOG.info("1 record inserted....");
		
		
	}

	public Student popUpStudent(int id) {
		
		String sql = "select * from students where id=?";
		Student student = jdbcTemplate.queryForObject(sql, new StudentRowMapper(), id);
		
		return student;
	}

	public void UpdateStudent(int id,Student student) {
		Object[] args = {student.getName(),student.getMobile(),student.getCountry(),id};
		String sql = "update seleniumexpress.students set name=?,mobile=?,country=? where id=?";
		int update = jdbcTemplate.update(sql, args);
		
		if(update!=0) {
			System.out.println("1 record updated....");
			LOG.info("1 record updated....");
		}
		
	}
	
	
	

}
