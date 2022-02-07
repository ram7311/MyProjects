package com.pract;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class StudentP{
	private int Id;
	private String name;
	
	public StudentP (Integer Id,String name){
		this.Id=Id;
		this.name=name;}
	
	public Integer getId() {
		return Id;}

	public String getName() {
		return name;
	}}

public class ConvertListToMap {
	public static void main(String[] args) {

		List<StudentP> l= new ArrayList<>();
		
		l.add(new StudentP(2,"Sukanya"));
		l.add(new StudentP(4,"Sukanya"));
		l.add(new StudentP(1,"Sukanya"));
		l.add(new StudentP(3,"Sukanya"));
		
		Map<Integer,String> mp= new HashMap<>();
		
		for(StudentP su :l) {
			mp.put(su.getId(),(su.getName()));
		}
		 System.out.println("Map  : " + mp);
	}

}
