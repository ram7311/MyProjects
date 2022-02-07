package com.tutorial5.java8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class LocalTimeP {

	public static void main(String[] args) {
		LocalTime time= LocalTime.now();
		//System.out.println(time);

        int h= time.getHour();
        int m= time.getMinute();
        int s= time.getSecond();
        int n= time.getNano();
        
       // System.out.println(h +" " +m+" "+s+" "+n);
        System.out.printf("%d %d %d %d",h,m,n,s );
		
	}

}
