package com.tutorial5.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayListP2 {

	public static void main(String[] args) {

		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(70);
		marks.add(45);
		marks.add(10);
		marks.add(65);
		marks.add(20);
		marks.add(25);
		System.out.println(marks);
		System.out.println("No of failed studentes: ");
		int count=0;
		for(Integer i: marks) {
			if (i>35){
				count++;
			}				                  
		}
		System.out.println(count);                     //using collections
		
	long l= marks.stream().filter(i-> i<35).count();  // using stream
		System.out.println(l);
		
		
	}
}
