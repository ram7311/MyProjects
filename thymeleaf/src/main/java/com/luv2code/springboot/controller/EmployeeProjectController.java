package com.luv2code.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springboot.dao.EmployeeDAOHibernateImpl;
import com.luv2code.springboot.entity.Employee;


@Controller
public class EmployeeProjectController {

	@Autowired
	private EmployeeDAOHibernateImpl empl;
	
	@GetMapping("/employee-list")
	public String listEmployees(Model theModel) {
		
		theModel.addAttribute("employees", empl.findAll());
		return "employees/employees";
		
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		Employee theEmployee = new Employee();
		theModel.addAttribute("employee", theEmployee);
		return "employees/employee-form";
		
	}	
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("employeeId") int theId,Model theModel) {
		
		Employee theEmployee = empl.findById(theId);
		theModel.addAttribute("employee", theEmployee);
		return "employees/employee-form";
		
	}	
	
	
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("employee") Employee thEmployee) {
		
		empl.save(thEmployee);
		return "redirect:/employee-list";		
	}
	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam("employeeId") int theId) {
		
		empl.deleteById(theId);
		return "redirect:/employee-list";		
	}
	
	
}
