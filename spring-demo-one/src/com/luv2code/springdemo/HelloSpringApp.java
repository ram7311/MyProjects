package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load the spring configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		TrackCoach TrackCoach = context.getBean("myTCoach", TrackCoach.class);

		BaseballCoach baseballCoach = context.getBean("myBCoach", BaseballCoach.class);
		CricketCoach cricketCoach = context.getBean("cricketCoach", CricketCoach.class);
		Coach vollyCoach = context.getBean("vollyCoach", Coach.class);

		Coach practice1 = context.getBean("practiceActivity", Coach.class);

		// call methods on the bean
		System.out.println("----------BaseBall Coach----------");
		System.out.println(baseballCoach.getDailyWorkout());
		System.out.println(baseballCoach.getDailyFortune());

		System.out.println("----------Track Coach---------");
		System.out.println(TrackCoach.getDailyWorkout());
		System.out.println(TrackCoach.getDailyFortune());

		System.out.println("----------Cricket Coach----------");
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getFoutuneService());
		System.out.println(cricketCoach.getEmail() + "\n" + cricketCoach.getTeam());
		System.out.println(cricketCoach.getEmail1() + "\n" + cricketCoach.getTeam1());

		System.out.println("----------Practice Activity1----------");
		System.out.println(practice1.getDailyWorkout());// practice Activity#1 done

		System.out.println("----------Practice Activity2----------");
		System.out.println(vollyCoach.getDailyFortune());// practice Activity#2 done

		// close the context
		context.close();

	}

}
