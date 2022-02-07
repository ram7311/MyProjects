package com.tutorial5.java8;
import java.util.function.Predicate;

// when we wanted to check boolean expressions
public class PredicateEx {

	public static void main(String[] args) {
   Predicate<Integer> p1= i-> i%2==0;
	System.out.println(p1.test(18));
	System.out.println(p1.test(19));
	System.out.println();
		
		String[] S= {"Chiranjeevi", "Venkates", "Balaiah", "Sunny", "Nag"};
		Predicate<String> p = s->s.length()>5;
		
		for(String s1: S) {
			if(p.test(s1)){
				System.out.println(s1);
			}
		}
		System.out.println();
		
 int[] x= {0,5,10,15,20,25,30,35};
  Predicate<Integer> p2= C-> C%2==0;
 
  System.out.println("Numbers which are even : ");
   for(Integer s1: x) {
	   if(p2.test(s1)){
		   System.out.println(s1);
	   }
   }
   System.out.println("Numbers which are greater than 10 : ");	
   Predicate<Integer> p3= D->D>10;
   for(Integer s2: x) {
	   if(p3.test(s2)){
		   System.out.println(s2);
   
	   }}
   
   System.out.println("If both are satisfied: ");
   
   for(int x2: x) {
	   if(p2.and(p3).test(x2)) {    // Predicate  Joining
		   System.out.println(x2);
	   }
   }
   

	}
}
