package com.luv2code.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.luv2code.springboot.util.Employee;

@Controller
public class EmployeeController {

	private List<Employee> theEmployee;
	
	@PostConstruct
	private void loadDate() {
		Employee employee1 = new Employee(1,"ram","kumar","ramkumar7311@gmail.com");
		Employee employee2 = new Employee(2,"sasi","kumar","sasikumar7311@gmail.com");
		Employee employee3 = new Employee(3,"satish","sahoo","sat@gmail.com");
		Employee employee4 = new Employee(4,"moon","sun","sunday@gmail.com");
		
		theEmployee = new ArrayList<Employee>();
		theEmployee.add(employee1);
		theEmployee.add(employee2);
		theEmployee.add(employee3);
		theEmployee.add(employee4);
		
	}
	
	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		
		theModel.addAttribute("employees", theEmployee);
		return "employees/employees";
		
	}
	
}
