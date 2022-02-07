
//public->protected->default->private....security

//private->default->protected->public..visibility..in inheritance we have to increase visibility not security 
//...i.e..achieved below

package com.tutorial;

 class Class1{
	
 final int i = 1000;	
     void m1() {
		System.out.println("Parent");
	}

}

 public class AccessMod extends Class1 {
		public void m1() {
			System.out.println("Child");
		}

		
	 public static void main(String[] args) {

		 AccessMod p=new AccessMod();
		 Class1 pc=new Class1();
		 p.m1();
		 pc.m1();
	 }

}
