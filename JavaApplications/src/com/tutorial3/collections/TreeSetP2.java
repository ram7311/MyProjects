package com.tutorial3.collections;

import java.util.Set;
import java.util.TreeSet;

//Duplicates         : Not Allowed
//Null values        : NotAllowed
//Insertion Order    : Not Allowed(not Preserved)
//Heterogenious      : Not Allowed
//Non-Synchronized

public class TreeSetP2 {
	public static void main(String[] args) {
		
		Set value= new TreeSet();
		
               value.add("A");
               value.add("Z");
               value.add("L");
               value.add("B");
               value.add("a");
               
		for( Object a:value) {
			System.out.println(a);
		}
		
	}

}
