package com.rest.dao;

import java.util.List;

import com.rest.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> findAll();
	
	public  Employee findById(int theId);
	
	public String save(Employee theEmployee);
	
	public String deleteById(int theId);
}
