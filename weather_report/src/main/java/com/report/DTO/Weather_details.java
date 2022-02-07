package com.report.DTO;

public class Weather_details {
	
	private String cityname;
	private int pincode;
	private String temparature ;
	
	public Weather_details() {
		// TODO Auto-generated constructor stub
	}

	

	public String getCityname() {
		return cityname;
	}



	public void setCityname(String cityname) {
		this.cityname = cityname;
	}



	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getTemparature() {
		return temparature;
	}

	public void setTemparature(String temparature) {
		this.temparature = temparature;
	}

	@Override
	public String toString() {
		return "Weather_details [cityName=" + cityname + ", pincode=" + pincode + ", temparature=" + temparature + "]";
	}
	
	

}
