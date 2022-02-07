package com.tutorial3.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedlistwithString {

	public static void main(String[] args) {
		LinkedList<String> l= new LinkedList<String>();
		
		l.add("Bala");
		l.add("Venk");
		l.add("chiru");
		l.add("nag");
		System.out.println(l);
		
		 ListIterator <String> Itr =l.listIterator();
		 
		while(Itr.hasNext()) {
			String c =Itr.next();
			 if(c.equals("Venk")) {
				 Itr.remove();}
				 else if(c.equals("nag")) {
					 Itr.add("chaithu");}
			 
				 else if(c.equals("chiru")) {
					 Itr.set("charan");	 
			
		
		}}
		 System.out.println(l);
	}
}
