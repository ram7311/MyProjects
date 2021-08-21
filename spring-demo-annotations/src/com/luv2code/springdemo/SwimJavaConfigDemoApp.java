package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		// read Spring config file

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// get bean from spring container
 
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

		// call method on the bean
		System.out.println(theCoach.getDailyWokout());
		// call the method on the daily fortune
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.email+"\n"+theCoach.team);

		context.close();

	}

}
