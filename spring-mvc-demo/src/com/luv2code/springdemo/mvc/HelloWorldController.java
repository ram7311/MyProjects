package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	// need a controller method to show the initial HTML form

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	@RequestMapping("/processFormVersionTwo")
	public String letsSoutDude(HttpServletRequest request, @RequestParam("studentEmail") String email,
			@RequestParam("studentTeam") String team, Model model) {
		// read the request parameter from html form
		String theName = request.getParameter("studentName");
		// convert the data to all caps
		theName = theName.toUpperCase();
		// create the message

		System.out.println(email+" \n"+team);
		String result = "Hi " + theName;
		// add message to the model
		model.addAttribute("message", result);
		model.addAttribute("email", email);
		model.addAttribute("team", team);

		return "helloworld";
	}

	// need a controller method to process the HTML form

}
