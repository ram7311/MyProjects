package com.tcs.java8;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx3 {

	public static void main(String[] args) {

		 Map<Integer, Employee> map = new TreeMap<Integer, Employee>();
		 map.put(101,new Employee("ram",11000));
		 map.put(102,new Employee("sam",2000));
		 map.put(103,new Employee("hari",6000));
		 map.put(104,new Employee("paul",1000));
		 //sort above map object based on employee salaries
		 
		 map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getSal))).forEach(System.out::println);;
		 System.out.println(employees());
	}
	
	public static List<Employee> employees(){
		
		return Stream.of(
				new Employee("ram",1000),
				new Employee("sam",1000),
				new Employee("sarala",1000),
				new Employee("jean",1000)).collect(Collectors.toList());
		
		
	}
}











