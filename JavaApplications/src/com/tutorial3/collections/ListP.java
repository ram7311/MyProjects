package com.tutorial3.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListP {
	public static void main(String[] args) {
		//Collection<Integer> value =new ArrayList<Integer>();
          List<Integer> value =new ArrayList<Integer>();
      value.add(2);
      value.add(98);
      value.add(5);
      value.add(78);
      value.add(13);
      value.add(1);
      
      
      
// Using ForEachLoop     
      value.forEach(System.out::println);  //Lamda expression 1.8 version
     
      
//using enhancement for loop
      
//    for(Object b:value) {
// 	   System.out.println(b);
//    }
//   
      
 //Using Iterator
       //ListIterator v= value.listIterator();
//        Iterator v= value.iterator();          //can be used Iterator(only forward direction) or List Iterator(forward and backward)
//        
//        while(v.hasNext()) {
//        //int	p =(int) v.next();  // for doing type casting
//        	 System.out.println(v.next());
//        }
       
      

      
      
      
  
//Collections.sort(value);     // sorting can't be done with Collection
//      System.out.println(value);
//      
//      value.add(2,6) ;        // We can't add values in between using collection interface
//      System.out.println(value);
	}

}
