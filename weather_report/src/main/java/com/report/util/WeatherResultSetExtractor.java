package com.report.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.report.DTO.Weather_details;

public class WeatherResultSetExtractor implements ResultSetExtractor<List<Weather_details>> {

	@Override
	public List<Weather_details> extractData(ResultSet rs) throws SQLException, DataAccessException {
		
		List<Weather_details> l= new ArrayList<Weather_details>();
		
		while(rs.next()) {
			
		Weather_details wd = new Weather_details();
		
		wd.setCityname(rs.getString("cityname"));
		wd.setPincode(rs.getInt("pincode"));
		wd.setTemparature(rs.getString("temparature"));
		
		l.add(wd);
		
		}
		return l;
	}

}
