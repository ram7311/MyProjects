package com.pract;
import java.util.*;

public class ConvertMapToList {

	    public static void main(String[] args) {
	    
	    
	    	Map<Integer, String> map = new HashMap<>();
	        map.put(40, "apple");
	        map.put(20, "orange");
	        map.put(30, "banana");
	        map.put(10, "watermelon");
	        map.put(50, "dragonfruit");
	    
	        System.out.println("\n1. Export Map Key to List...");	    
	        List<Integer> result = new ArrayList(map.keySet());	
	        
	      // System.out.println(result); [50, 20, 40,10,30]
	        result.forEach(System.out::println);
	        
	        
	        System.out.println("\n2. Export Map Value to List...");
	        	        
	        List<String> result1 = new ArrayList(map.values());	        
	        result1.forEach(System.out::println);
	        

}}
