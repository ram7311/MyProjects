package com.tutorial3.collections;
//Duplicates         : Keys are not allowed but values allowed
//Null values        : for keys only one but for values allowed
//Insertion Order    : Not-Allowed(Preserved)
//Heterogenious      : Allowed

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapP {

	public static void main(String[] args) {
		Map m=new HashMap();
		m.put("Name", "Sukanya");
		m.put("Company", "TCS");
		m.put("location","bnglr");
		m.put("Project", "RR");
		m.put("Project1", "RR");
		m.put("Project2", null);
		m.put("Project3", null);
		m.put("Project3", 123);
		m.put(null, "RR1");
		m.put(null, "RR2"); // replaced
		
		//System.out.println(m.get("Name"));
		
//		Set<Map.Entry<String, String>> keys =m.entrySet();
//		
//		for(Map.Entry<String, String> e:keys) {
//			System.out.println(e.getKey()+"   "+e.getValue());
//		}
		
		
	 Set<String> keys =m.keySet();
	 for( String k:keys) {
		 System.out.println(k+"   "+m.get(k));
		 }
		
}}
