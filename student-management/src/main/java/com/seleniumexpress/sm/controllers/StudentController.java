package com.seleniumexpress.sm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.seleniumexpress.sm.DAO.StudentDAO;
import com.seleniumexpress.sm.api.Student;
import com.seleniumexpress.sm.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/showStudent")
	public String showStudentList(Model model) {
    //call the dao mehod to get the student data
		
		//List<Student> studentList = studentDAO.loadStudents();
		List<Student> studentList = studentService.loadStudents();
		for(Student tempStudent:studentList)
		{
			System.out.println(tempStudent);
		}
		
		model.addAttribute("students", studentList);
		return "student-list";
	}

	@GetMapping("/showAddStudentPage")
	public String addStudent(Model model) {
		
		Student student = new Student();
		
		model.addAttribute("student", student);
		
		return "add-student";
	}
	
	@PostMapping("/save-student")
	public String saveStudent(Student student) {
		//write the logic to save data to DB
		System.out.println(student);
		studentService.saveStudent(student);
		
		
		return "redirect:/showStudent";
	}
	
	@ResponseBody
	@GetMapping("/thankyou")
	public String thankyou() {
		
		return "Thank you.... your record has been added to the database";
	}
	
	
	@GetMapping("/popUpStudent")
	public String popUpStudent(@RequestParam("userId") int id,Model model) {
		
		Student theStudent = studentService.popUpStudent(id);
		
		model.addAttribute("student", theStudent);
		
		return "update-student";
	}
	
	@PostMapping("/updateStudent")
	public String updateStudent(@RequestParam("userId") int id,Student student,Model model) {
		
		studentService.UpdateStudent(id,student);
		
			
		return "redirect:/showStudent";
	}
	
	@GetMapping("/deleteStudent")
	public String deleteStudent(@RequestParam("userId") int id) {
		
		studentService.deleteStudent(id);
		
		
		return "redirect:/showStudent";
	}
}
