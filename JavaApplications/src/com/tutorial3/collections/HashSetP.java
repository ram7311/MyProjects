package com.tutorial3.collections;

import java.util.HashSet;
import java.util.Set;

//Duplicates         : Not Allowed
//Null values        : Allowed(only once)
//Insertion Order    : Not Allowed(not Preserved)
//Heterogenious      : Allowed
//Non-Synchronized

public class HashSetP {
	public static void main(String[] args) {
		
		Set s=new HashSet();
		s.add(12);
		s.add(45);
		s.add(null);   
		s.add(3);
		s.add(78);
		s.add(98);
		s.add(56);
		s.add(28);
		s.add(18);
		s.add(4);
		s.add(9);
		s.add(12);
		s.add(null);    
		s.add("Suk");
		System.out.println(s.add(12)); //false since it is duplicate
		for( Object a:s) {
			System.out.println(a);
		}
		
	}

}
