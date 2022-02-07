package com.tutorial5.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayListP4 {

	public static void main(String[] args) {

		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(70);
		marks.add(45);
		marks.add(10);
		marks.add(65);
		marks.add(20);
		marks.add(25);
		System.out.println(marks);
		System.out.println("Marks in ascending order: ");
		
		Collections.sort(marks);		
		System.out.println(marks);     // prints only in ascending order using collections
		
		Collections.reverse(marks);    // prints only in descending order using collections
		System.out.println(marks);
		
	List<Integer> sortedList= marks.stream().sorted().collect(Collectors.toList());   /// by default compable compareTo() implemented default sorting order printted
		
		System.out.println(sortedList);
		
   List<Integer> sortedList1= marks.stream().sorted((i1,i2)->(i1<i2)?-1:(i1>i2)?1:0).collect(Collectors.toList()); // Ascending order using Comparator
   System.out.println(sortedList1);
   
   List<Integer> sortedList2= marks.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList()); // Descending order using Comparator
   System.out.println(sortedList2);
   
	}
}
