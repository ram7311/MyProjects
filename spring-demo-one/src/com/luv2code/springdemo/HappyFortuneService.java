package com.luv2code.springdemo;

public class HappyFortuneService implements FoutuneService {

	@Override
	public String getFortune() {
		
		return "Today is your lucky day!";
	}

}
