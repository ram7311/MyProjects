package com.tutorial3.collections;

import java.util.Set;
import java.util.TreeSet;

//Duplicates         : Not Allowed
//Null values        : NotAllowed
//Insertion Order    : Not Allowed(not Preserved)..by default ascending order
//Heterogenious      : Not Allowed
//Non-Synchronized

public class TreeSetP {
	public static void main(String[] args) {
		
		Set<Integer> value= new TreeSet<Integer>();
		//Set<Integer> value= new TreeSet<Integer>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0); // for decreasing order
		value.add(12);
		value.add(45);
		value.add(3);
		value.add(78);
		value.add(98);
		value.add(56);
		value.add(28);
		value.add(18);
		value.add(4);
		value.add(9);
		value.add(12);  // duplicate is not allowed
		//value.add(null); //  supported only once
		//value.add("sukanya"); //heterogenious elements are not allowed
		
		for( Object a:value) {
			System.out.println(a);
		}
		
	}

}
