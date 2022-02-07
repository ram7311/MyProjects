package com.report.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.report.DTO.Weather_details;
import com.report.dao.Weather_DAO_impl;
import com.report.util.WeatherResultSetExtractor;

@Service
public class Weather_service {
	
	@Autowired
	Weather_DAO_impl weather_DAO;
	
	public Weather_service() {
		// TODO Auto-generated constructor stub
	}
	
	
public String add(Weather_details weather_details) {
	
return	weather_DAO.add(weather_details);
}

public String updateTemparature(int picode,String temparature) {
	
	return weather_DAO.updateTemparature(picode, temparature);
}

public String deleteTemparature(int picode) {
	
return	weather_DAO.deleteTemparature(picode);
}

public List<Weather_details> showReport() {
	return weather_DAO.showReport();
}

}
