package com.luv2code.springdemo;

public class VollyCoach implements Coach {

	PracticeActivity2 practiceActivity2;

	public void setPracticeActivity2(PracticeActivity2 practiceActivity2) {
		this.practiceActivity2 = practiceActivity2;
	}

	public PracticeActivity2 getPracticeActivity2() {
		return practiceActivity2;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
		return practiceActivity2.getFortune();
	}

}
