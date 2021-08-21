package com.online.hql;

import java.util.Date;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;



public class schedulerr {

	
	  @Scheduled(fixedRate = 5000) 
	  public void schdule() {
	  
	  System.out.println("i am called now:"+new Date());
	  
	  }
	 
	
	/*
	 * @Scheduled(fixedDelay = 3000) public void schdule2() {
	 * 
	 * System.out.println("i called now:"+new Date());
	 * 
	 * }
	 */
	//@Scheduled(cron = "*/5 * * * * *")
	/*
	 * public void schdule3() {
	 * 
	 * System.out.println("Cron:"+new Date());
	 * 
	 * }
	 */
}
