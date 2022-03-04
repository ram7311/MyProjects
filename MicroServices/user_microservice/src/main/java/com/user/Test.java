package com.user;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {
	
	RestTemplate restTemplate = new RestTemplate();
	
	ObjectMapper m = new ObjectMapper();
	
	public static void main(String[] args) throws Exception {
		
		//http://date.jsontest.com
		Test test= new Test();
		test.temp();
	}
	public void temp() {
		HttpHeaders header = new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> httpEntity = new HttpEntity<String>(header);
		ResponseEntity<Object> exchange = restTemplate.exchange("http://date.jsontest.com", HttpMethod.GET, httpEntity, Object.class);
		Pojo convertValue = m.convertValue(exchange.getBody(), Pojo.class);
		System.out.println(convertValue);
	}
	
}
