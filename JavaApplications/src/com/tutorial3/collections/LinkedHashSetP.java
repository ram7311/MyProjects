package com.tutorial3.collections;

import java.util.LinkedHashSet;
import java.util.Set;

//Duplicates         : Not Allowed
//Null values        : Allowed(only once)
//Insertion Order    : Allowed
//Heterogenious      : Allowed
//Non-Synchronized
//same as HashSet except insertion order
public class LinkedHashSetP {
	public static void main(String[] args) {
		
		LinkedHashSet lh=new LinkedHashSet();
		lh.add(12);
		lh.add(45); 
		lh.add(3);
		lh.add(78);
		lh.add(98);
		lh.add(56);
		lh.add(28);
		lh.add(18);
		lh.add(4);
		lh.add(9);
		lh.add(12);
		lh.add("Suk");
		
		for( Object a:lh) {
			System.out.println(a);
		}
		
	}

}
