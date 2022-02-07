//When we want to add different type of objects as a single unit where duplicates are allowed and insertion is preserved.
// Bydefault initial capacity is 10

//Duplicates         : Allowed
//Null values        : Allowed
//Insertion Order    : Allowed(Preserved)
//Heterogenious      : Allowed
//Non-Synchronized

//default capacity is 10
// If we are doing retrival operation(Random Access) then go for Array List.
//If we want to perform insertion or deletion Arraylist not recomended.

package com.tutorial3.collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {

		Collection list =new ArrayList(); //
		ArrayList list1=new ArrayList(); // we can pass heterogenious elements
		ArrayList list2=new ArrayList();
		ArrayList<String> list3=new ArrayList<String>(); // we can pass only string values
		ArrayList<Integer> list4=new ArrayList<Integer>(); //we can pass only Integer values
		ArrayList<Integer> list5=new ArrayList<Integer>();
		
		list1.add(10);
		list1.add("Sukanya");
		list1.add(67.00999);
		list1.add(34);
		//list1.add(null); 
		list1.add(10);
		//list1.add(0, "Suk");
		System.out.println(list1);
		
		System.out.println(list1.contains("Suk"));
		
		list2.add(7);
		System.out.println(list2);
		
		list1.addAll(list2);
		System.out.println(list1);
		list1.remove(0);   //remove first element in the list1
		
		//list1.clear();
		//System.out.println(list1);
		
	//Enhanced for loop
		for(Object a:list1) {
			System.out.println(a);
				}
   //Cursor Iterator
		
		 Iterator itr =list1.iterator();
		 
		 while(itr.hasNext()) {
		          Object b= itr.next();
		          if(b.equals("Sukanya")) {
		        	  itr.remove();	  
		          }    			 
			}
			System.out.println(list1);	
			
			for(int i=0;i<=30;i++)
				if(i%2==0) {
					list4.add(i);
				}
				else
				list5.add(i);
			System.out.println(list4);
			System.out.println(list5);
		}}
		
       
