package com.tutorial3.collections;
import java.util.Vector;
// Capacity will be incremented 100% and it is Synchrinized(Thread Safe) and Slow since the waiting time is present.

//Duplicates         : Allowed
//Null values        : Allowed
//Insertion Order    : Allowed(Preserved)
//Heterogenious      : Allowed
//Synchronized

public class VectorP {

	public static void main(String[] args) {
		final Vector v= new Vector();
		System.out.println("old Capacity:"+v.capacity()); //10
		v.add(2);
		v.add(22);
		v.add(23);
		v.add(12);
		v.add(8);
		v.add(19);
		v.add(9);
		v.add(9);
		v.add(69);
		v.add(97);
		v.add(67);
		v.add(null);
		v.add("Sukanya");
		System.out.println("New Capacity:"+v.capacity());    //20
		//v.forEach(System.out::println);   //using for each loop
		for(Object a:v) {
			System.out.println(a);          // Using Enhance For loop
		}
		v.remove(0);
	}

}
