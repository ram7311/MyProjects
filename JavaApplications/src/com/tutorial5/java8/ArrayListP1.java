package com.tutorial5.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayListP1 {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(0);
		a.add(5);
		a.add(10);
		a.add(15);
		a.add(20);
		System.out.println(a);
		System.out.println("The even numbers are: ");
		for(Integer i: a) {
			if(i%2==0)
				System.out.println(+i);                   
		}
		
		List<Integer> l= a.stream().filter(i->i%2==0).collect(Collectors.toList());  // using stream
		System.out.println(l);
		
		
	}
}
