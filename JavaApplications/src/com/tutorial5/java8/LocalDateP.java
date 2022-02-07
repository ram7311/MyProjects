package com.tutorial5.java8;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateP {

	public static void main(String[] args) {
		LocalDate date= LocalDate.now(); // current system date
		System.out.println(date);

		
		int yy= date.getYear();
		int mm= date.getMonthValue();
		int dd= date.getDayOfYear();
		System.out.println(yy+"  "+mm+"   "+dd);
	
		Month m= date.getMonth();
		System.out.println(m); // JANUARY
		
	
	}

}
