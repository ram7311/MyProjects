package com.seleniumexpress.sm.DAO;

import java.util.List;

import com.seleniumexpress.sm.api.Student;

public interface StudentDAO {
	
	List<Student> loadStudents();
	public void saveStudent(Student student);
	Student popUpStudent(int id);
	void UpdateStudent(int id,Student student);

}
