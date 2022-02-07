package com.tutorial5.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayListP6 {

	public static void main(String[] args) {

		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(70);
		marks.add(45);
		marks.add(10);
		marks.add(65);
		marks.add(20);
		marks.add(25);
		System.out.println(marks);
	Integer min= marks.stream().min((i1,i2)-> i1.compareTo(i2)).get();
	System.out.println(min);
	Integer max= marks.stream().max((i1,i2)-> i1.compareTo(i2)).get();
	System.out.println(max);	
	}
}
