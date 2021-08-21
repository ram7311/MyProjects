package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load spring configuration file
		
		//load the spring configuration
				ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

				//retrieve bean from spring container
				TrackCoach theCoach=context.getBean("myTCoach", TrackCoach.class);
				TrackCoach alphaCoach=context.getBean("myTCoach", TrackCoach.class);
				
//check if they are the same
				
				boolean result=(theCoach==alphaCoach);
				System.out.println("\n pointing to the same object "+result);
				
				System.out.println("\n memory location for theCoach :"+theCoach+"\n");
				System.out.println("\n memory location for alphaCoach :"+alphaCoach);
				context.close();
	}

}
