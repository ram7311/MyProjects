package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	
	private FoutuneService foruneService;
	
	public BaseballCoach(FoutuneService theforuneService) {
		foruneService=theforuneService;
		
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		//use my fortuneService to get a fortune
		return foruneService.getFortune();
	}
	
	public void startup() {
		System.out.println("bean starting..........");
	}
	
	public void destroymethod() {
		System.out.println("bean ending..........");
		
	}
	

	
}
