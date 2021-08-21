package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	@Value("${foo.email}")
	protected String email;
	@Value("${foo.team}")
	public String team;
	
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		
		this.fortuneService=fortuneService;
	}
	
	@Override
	public String getDailyWokout() {
		return "Swim 1000 meters as a warm up";
	}
	
	public String getDailyFortune() 
	{
		return fortuneService.getFortune();
	}

}
