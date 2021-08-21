package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FoutuneService foutuneService;
	private String email;
	private String team;
	private String email1;
	private String team1;
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

	public String getFoutuneService() {
		return foutuneService.getFortune();
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

	public String getEmail1() {
		return email1;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public String getTeam1() {
		return team1;
	}

	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	
	

}
