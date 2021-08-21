package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FoutuneService foutuneService;
	private String email;
	private String team;
	public TrackCoach(FoutuneService foutuneService) 
	{
		this.foutuneService=foutuneService;
		
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5K";
	}

	@Override
	public String getDailyFortune() {
		
		return foutuneService.getFortune();
	}

	public FoutuneService getFoutuneService() {
		return foutuneService;
	}

	public void setFoutuneService(FoutuneService foutuneService) {
		this.foutuneService = foutuneService;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	

}
