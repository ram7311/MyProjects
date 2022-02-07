package com.tutorial3.collections;
import java.util.LinkedHashMap;

//Duplicates         : Keys are not allowed but values allowed
//Null values        : for keys only one but for values allowed
//Insertion Order    : Allowed(Preserved)
//Heterogenious      : Allowed

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer,String> m= new LinkedHashMap<Integer,String>();   //Ascending Order
		
		//TreeMap<Integer,String> m1= new TreeMap<Integer,String> ((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);  //For Descending Order
             m.put(101, "Suk");
             m.put(106, "Pallavi");
             m.put(103, "Sid");
             m.put(102, "Aru");
             m.put(105, "Anu");
             m.put(104, "Ta");
             System.out.println(m);
          
	}

}
