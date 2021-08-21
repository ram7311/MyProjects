package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	FortuneService fortuneService;

	@Override
	public String getDailyWokout() {
		return "Tennis practice for 4 hours";
	}
	
	public String getservice() {
		return fortuneService.getFortune();
	}
	
	
	
	

}
