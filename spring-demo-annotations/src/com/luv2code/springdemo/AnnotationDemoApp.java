package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read Spring config file
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get bean from spring container
		
		Coach theCoach=context.getBean("thatSillyCoach", Coach.class);
		BillaCoach billaCoach=context.getBean("billaCoach", BillaCoach.class);
		TennisCoach tennisCoach=context.getBean("thatSillyCoach", TennisCoach.class);
		HockeyCoach hockeyCoach=context.getBean("hockeyCoach",HockeyCoach.class);
		HockeyCoach hockeyCoach2=context.getBean("hockeyCoach",HockeyCoach.class);
		
		//call method on the bean
		
		System.out.println(theCoach.getDailyWokout());
		System.out.println(billaCoach.getDailyWokout());
		System.out.println(billaCoach.getFortuneServiceEx());
		System.out.println(billaCoach.getRestFortuneService());
		System.out.println(billaCoach.getDatabaseFortuneServiceEx());
		System.out.println(tennisCoach.getservice());
		System.out.println(hockeyCoach.team);
		boolean check=(hockeyCoach==hockeyCoach2);
		System.out.println(check);
		context.close();

	}

}
