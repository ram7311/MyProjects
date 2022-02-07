package com.tutorial5.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayListP5 {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		                  names.add("Sukanya");
		                  names.add("Bunny");
		                  names.add("Sunny");
		                  names.add("Cunny");
		                  names.add("Funny");
		                  names.add("Runny");
		                  
		System.out.println(names);
		
        Collections.sort(names);
        System.out.println(names);         //Ascending order

         Collections.reverse(names);
         System.out.println(names);         //Descending order
         System.out.println(); 
         
         List<String> SortedNames= names.stream().sorted().collect(Collectors.toList());  // default sorting order Comparable        
         System.out.println(SortedNames); 
         
         System.out.println(); 
         
         List<String> SortedNames1= names.stream().sorted((e1,e2)->e1.compareTo(e2)).collect(Collectors.toList()); // default sorting order Comparable
         System.out.println(SortedNames1); 
         
         List<String> SortedNames2= names.stream().sorted((e1,e2)->e2.compareTo(e1)).collect(Collectors.toList()); // default sorting order Comparable 
         System.out.println(SortedNames2); 
	}
}
