package com.tutorial5.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayListP3 {

	public static void main(String[] args) {

		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(0);
		marks.add(5);
		marks.add(10);
		marks.add(15);
		marks.add(20);
		System.out.println(marks);
		System.out.println("The Updtad marks are: ");
		
		for(Integer i: marks) {
			i=i+5;
				System.out.println(i);                   
		}
		
	List<Integer> l= marks.stream().map(i->i+5).collect(Collectors.toList());  // using stream
		System.out.println(l);
		
		
	}
}
