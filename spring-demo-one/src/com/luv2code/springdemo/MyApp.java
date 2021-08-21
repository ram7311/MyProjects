package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		//create the object
		
		Coach theCoach=new BaseballCoach(null);//null for construnctor arg
		Coach theCoachT=new TrackCoach(null);//null for construnctor arg
		//use the object
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoachT.getDailyWorkout());

	}

}
