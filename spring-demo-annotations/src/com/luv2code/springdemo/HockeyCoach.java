package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class HockeyCoach implements Coach {

	@Value("${foo.team}")
	public String team; 
	public long a,b,c;
	
	
	
	
	public HockeyCoach() {
		System.out.println("Hockey Coach constructor");
	}

	@Override
	public String getDailyWokout() {
		return "Hockey Coach";
		
	}
	
	@PostConstruct
	public void test1() 
	{
		System.out.println("Post Construct");
		a=System.currentTimeMillis();
	}
	
	@PreDestroy
	public void test2() 
	{
		
		System.out.println("Pre Destroy");
		b=System.currentTimeMillis();
		System.out.println(b-a);
	}
	

}
