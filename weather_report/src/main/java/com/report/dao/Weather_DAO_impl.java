package com.report.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.report.DTO.Weather_details;
import com.report.util.WeatherResultSetExtractor;

@Repository
public class Weather_DAO_impl implements Weather_DAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public Weather_DAO_impl() {
		// TODO Auto-generated constructor stub
	}
	
	public String add(Weather_details weather_details) {
		int added_count=0;
		Optional<Weather_details> ofNullable = Optional.ofNullable(weather_details);
		if(ofNullable.isPresent())
		{
			
		//connect to DB and store the given data
		System.out.println("data stored -> "+weather_details.getCityname());
		String sql = "INSERT INTO `sys`.`weather_report`\r\n"
				+ "(`cityname`,\r\n"
				+ "`pincode`,\r\n"
				+ "`temparature`)\r\n"
				+ "VALUES('"+ofNullable.get().getCityname()+"',"+ofNullable.get().getPincode()+",'"+ofNullable.get().getTemparature()+"')";
		System.out.println("-----------"+sql);
		added_count = jdbcTemplate.update(sql);
		System.out.println("Number of records added->"+added_count);
		}
		
		return added_count==1?"Success":"Fail";
		
		
	}
	
public String updateTemparature(int picode,String temparature) {
	int updated_count=0;	
	
		String sql = "update sys.weather_report set temparature='"+temparature+"' where pincode="+picode;
		updated_count = jdbcTemplate.update(sql);
		System.out.println("Number of records Updated->"+updated_count);
		
		return updated_count==1?"Success":"Fail";
	}

public String deleteTemparature(int picode) {
	int deleted_count=0;
	String sql = "update sys.weather_report set temparature='' where pincode="+picode;
	deleted_count = jdbcTemplate.update(sql);
	System.out.println("Number of records deleted ->"+deleted_count);
	
	return deleted_count==1?"Success":"Fail";
}

public List<Weather_details> showReport() {
	String sql = "SELECT * FROM sys.weather_report";
	List<Weather_details> report = jdbcTemplate.query(sql, new WeatherResultSetExtractor());
	return report;
}


}
