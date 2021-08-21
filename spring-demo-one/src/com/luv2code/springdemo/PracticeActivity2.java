package com.luv2code.springdemo;

import java.util.Random;

public class PracticeActivity2 implements FoutuneService {

	String[] a = { "SpeedFortune", "MidFortune", "SlowFortune" };
	Random b = new Random();

	@Override
	public String getFortune() {

		return a[b.nextInt(3)];
	}

}
