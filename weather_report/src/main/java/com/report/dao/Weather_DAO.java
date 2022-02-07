package com.report.dao;

import java.util.List;

import com.report.DTO.Weather_details;

public interface Weather_DAO {
	
	public String add(Weather_details weather_details) ;
	public String updateTemparature(int picode,String temparature);
	public String deleteTemparature(int picode);
	public List<Weather_details> showReport();

}
