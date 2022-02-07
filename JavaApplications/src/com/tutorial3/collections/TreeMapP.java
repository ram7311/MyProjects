package com.tutorial3.collections;

import java.util.TreeMap;
//Duplicates         : Keys are not allowed but values allowed
//Null values        : for keys only one but for values allowed
//Insertion Order    : Not Allowed(Preserved)-Ascending order
//Heterogenious      : Allowed

public class TreeMapP {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> m= new TreeMap<Integer,String>();   //Ascending Order
		
		TreeMap<Integer,String> m1= new TreeMap<Integer,String> ();  //For Descending Order instead of Comparator
             m.put(101, "Suk");
             m.put(106, "Pallavi");
             m.put(103, "Sid");
             m.put(102, "Aru");
             m.put(105, "Anu");
             m.put(104, "Ta");
             System.out.println(m);
             
             m1.put(100, "Suk1");
             m1.put(200, "Pallavi1");
             m1.put(400, "Sid1");
             m1.put(600, "Aru1");
             m1.put(300, "Anu1");
             m1.put(500, "Ta1");
             System.out.println(m1);
	}

}
