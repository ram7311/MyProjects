package com.tutorial3.collections;
//Duplicates         : Keys are not allowed but values allowed
//Null values        : for keys only one but for values allowed
//Insertion Order    : Preserved
//Heterogenious      : Allowed


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapP3 {

	public static void main(String[] args) {
		Map m=new HashMap();
		m.put(101, "Sukanya");
		m.put(102, "Sukanya1");
		m.put(103,"Sukanya2");
		m.put(104, "Sukanya3");
		m.put(105, "Sukanya4");
		m.put(106, "Sukanya5");
		m.put(107, "Sukanya6");

		System.out.println("\n" + "printing keys : ");
		
		List<Integer> keys1 =  new ArrayList(m.keySet());  //[101,102,103....107]
		 keys1.forEach(System.out::println);
		
		 System.out.println("\n" + "printing  values: ");
			
			List<String> keys2 =  new ArrayList(m.values());
			 keys2.forEach(System.out::println);
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Set<Map.Entry<Integer, String>> keys =  m.entrySet();
//		for(Map.Entry<Integer, String> e:keys) {
//			System.out.println(e.getKey()+"   "+e.getValue());
//		}

		
}}
