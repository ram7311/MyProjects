package com.tcs.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Local_Date_time {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfYear());
		System.out.println(date.getMonthValue());
		System.out.println(date.getYear());
		System.out.println(date.getMonth());
		System.out.println(date.isLeapYear()+"\n------------------------------");
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		System.out.println(dateTime.getHour());
		System.out.println(dateTime.getMinute());
		System.out.println(dateTime.getSecond());
		System.out.println(dateTime.getNano());
		System.out.println(dateTime.of(2020, 12, 29, 6, 30)+"\n------------------------------");
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println(time.getHour());
	}

}
