package com.report.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.report.DTO.Weather_details;
import com.report.exception.InputEmptyException;
import com.report.service.Weather_service;

@RestController
public class WeatherController {
	
	private static final Logger log = LogManager.getLogger(WeatherController.class);	
	@Autowired
	Weather_service weather_service;

	@PostMapping("/weather/add")
	public String add(@RequestBody Weather_details weather_details ) {
		String result=null;
		
		log.info("Input --> "+weather_details.getCityname()+" "+weather_details.getPincode()+" "+weather_details.getTemparature());

		if(!weather_details.getCityname().isEmpty() && weather_details.getPincode()!=0 && !weather_details.getTemparature().isEmpty()) {
			result = weather_service.add(weather_details);
			log.info("Result-> "+result);
			return result;
		}
		else {
			
			throw new InputEmptyException("Some fields are empty");
		}
		
		
		
	}
	//update temparature
	@PutMapping("/weather/{pincode}/{temparature}")
	public String updateTemparature(@PathVariable int pincode,@PathVariable String temparature) {
		System.out.println("updateTemparature ->"+pincode+" "+temparature);
		
		if (pincode != 0 && !temparature.isEmpty()) {
			return weather_service.updateTemparature(pincode, temparature);

		}
		else {
			throw new InputEmptyException("Some fields are empty");
		}
		
		
		
	}
	
	@DeleteMapping("/weather")
	public String deleteTemparature(@RequestParam("delete") int pincode ){
		System.out.println("deleteTemparature ->"+pincode);
		if (pincode!=0) {
		return	weather_service.deleteTemparature(pincode);
		}
		else {
			throw new InputEmptyException("Some fields are empty");
		}
		
		
	}
	
	@InitBinder
	public void delete_PreProcessing(WebDataBinder binder) {
		System.out.println("Init Binder executes before calling corresponding method to make some pre prosessing activities ..it has some utility methods"
				+ "This can be placed in @ControllerAdvice annotated class then it will execute before every controller methods");
	}
	
	@GetMapping("/weather/report")
	public List<Weather_details> showReport() {
		
		List<Weather_details> showReport = weather_service.showReport();
		if (!showReport.isEmpty()) {
			
			return showReport;
			
		} else {
			
			throw new NullPointerException("Object contains Null");
		}
		
		
		
	}
	
	@GetMapping("weather/global_ModelAttribute")
	public void weather_Info(@ModelAttribute("w_details") Weather_details wd)//it takes the data from controller_Advice class modelAttribute 
	{
		System.out.println(wd.getCityname()+"--"+wd.getTemparature());
	}
	
}
