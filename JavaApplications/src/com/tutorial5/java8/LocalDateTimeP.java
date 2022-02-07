package com.tutorial5.java8;

import java.time.LocalDateTime;

public class LocalDateTimeP {

	public static void main(String[] args) {
		LocalDateTime dt= LocalDateTime.now();
		System.out.println(dt);
		
		
		int y= dt.getYear();
		int mn=dt.getMonthValue();
		int d= dt.getDayOfMonth();
		
		int h= dt.getHour();
		int m= dt.getMinute();
		int s= dt.getSecond();
		int n= dt.getNano();
		
        System.out.printf("%d-%d-%d %d:%d:%d:%d",y,mn,d,h,m,s,n);
        
        System.out.println();
        
        LocalDateTime dt1= LocalDateTime.of(1996,9,20,4,30);
        
        System.out.printf("After six months: "+dt1.plusMonths(6));
        System.out.printf("After six months: "+dt1.minusMonths(6));
        
        
        
        
        
        
        
        
        
        
        
	}

}
