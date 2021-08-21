package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rest.dao.EmployeeDAO;
import com.rest.entity.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	//inject employee dao
	@Autowired
	private EmployeeDAO employeeDAO; 
	//expose "/employee" and return list of employees
	
	@GetMapping("/employees")
	public List<Employee> findAll(){
		return employeeDAO.findAll();
	}
	@GetMapping("/employee/{id}")
	public Employee findById(@PathVariable int id){
		return employeeDAO.findById(id);
	}

	@PostMapping("/save")
	public String findById(@RequestBody Employee employee){
		return employeeDAO.save(employee);
	}
	@GetMapping("/delete/{id}")
	public String deleteById(@PathVariable int id){
		return employeeDAO.deleteById(id);
	}
}
