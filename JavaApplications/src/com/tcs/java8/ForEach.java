package com.tcs.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import com.sun.javafx.collections.MappingChange.Map;

public class ForEach {

	public static void main(String[] args) {
		
	List<String> l = new ArrayList<>();
	l.add("ram");
	l.add("monica");
	l.add("sam");
	l.add("andrea");
	l.add("isaac");
	l.add("peter");
	
	l.stream().forEach(i->System.out.println(i));
	l.stream().forEach(System.out::println);//method reference
	
	HashMap<Integer, String> map = new HashMap<Integer,String>();
	map.put(4,"a" );
	map.put(2,"z" );
	map.put(5,"d" );
	map.put(3,"c" );
	map.put(1,"b" );
	
	for(Entry<Integer, String> entries : map.entrySet()) {
		System.out.println(entries.getKey()+" "+entries.getValue());
	}
	
	map.entrySet().stream().forEach(System.out::println);//1=a default way of printing 
	//sorting based on keys
	List<Entry<Integer,String>> entrys = new ArrayList<>(map.entrySet());
	Collections.sort(entrys, (i1,i2)->i1.getKey().compareTo(i2.getKey()));//ascending order
	
	for(Entry<Integer, String> entries : entrys) {
		System.out.println(entries.getKey()+" "+entries.getValue());
	}
	System.out.println("--------------------");
    Collections.sort(entrys, (i1,i2)->i2.getKey().compareTo(i1.getKey()));//descending order
	
	for(Entry<Integer, String> entries : entrys) {
		System.out.println(entries.getKey()+" "+entries.getValue());
	}
	
	System.out.println("--------------------");
    Collections.sort(entrys, (i1,i2)->i2.getValue().compareTo(i1.getValue()));//descending order based on values
	
	for(Entry<Integer, String> entries : entrys) {
		System.out.println(entries.getKey()+" "+entries.getValue());
	}
	System.out.println("--------------------");
	map.entrySet().stream().sorted(HashMap.Entry.comparingByKey()).forEach(System.out::println);
	System.out.println("--------------------");
	map.entrySet().stream().sorted(HashMap.Entry.comparingByValue()).forEach(System.out::println);
	
	}

}
