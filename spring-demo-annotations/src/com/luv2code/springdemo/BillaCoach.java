package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BillaCoach implements Coach {

	// Field injection
	@Autowired
	FortuneService databaseFortuneService;

	FortuneService fortuneService;
	RestFortuneService restFortuneService;

	// constructor injection
	@Autowired
	public BillaCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
		System.out.println("Billacoach autowiring");
		this.fortuneService = fortuneService;
	}

	public String getRestFortuneService() {
		return restFortuneService.getFortune();
	}

	// setter injection
	@Autowired
	public void setRestFortuneService(RestFortuneService restFortuneService) {
		this.restFortuneService = restFortuneService;
	}

	@Override
	public String getDailyWokout() {
		return "Play from morning to evening";
	}

	public String getFortuneServiceEx() {
		return fortuneService.getFortune();
	}
	
	public String getDatabaseFortuneServiceEx() {
		return databaseFortuneService.getFortune();
	}

}
