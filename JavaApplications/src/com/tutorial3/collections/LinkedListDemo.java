//Duplicates         : Allowed
//Null values        : Allowed
//Insertion Order    : Allowed(preserved)
//Heterogenious      : Allowed
//Non-Synchronized
// Bydefault initial capacity is 0

// If we are doing retrival operation(Random Access) then don't go for Linked List.
//If we want to perform insertion or deletion Linked list issss recomended.

package com.tutorial3.collections;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		{LinkedList l=new LinkedList();
		
		LinkedList<Integer> l2= new LinkedList();
		LinkedList<String> l3= new LinkedList();
		l.addFirst(4);      // only works for LinkedList
		l.add(20);
		l.add(23);
		l.add("Sukku");
		l.add(20);
		l.add(null);		
		l.addLast(8);
		System.out.println(l.peekLast());     //8
		System.out.println(l.peekFirst());    //4
		System.out.println(l);
		l.pollFirst();  //removes first element
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l);
		System.out.println("Size of the List is: " +l.size());
		l.removeFirst();
		l.removeLast();
		System.out.println(l);
		System.out.println();
		}
		
		
	
	}

}
