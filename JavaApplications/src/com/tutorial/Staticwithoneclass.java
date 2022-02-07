package com.tutorial;

public class Staticwithoneclass {
 static int i=30;
 
 public static void m1() {
	 System.out.println("inside static method: "+i); //100
 }
 public void show() {
	 System.out.println("inside show method: "+i); //100
 }
 
 
	public static void main(String[] args) {
		int i=20;
		System.out.println("Inside main method: "+i); //20
		Staticwithoneclass obj=new Staticwithoneclass();
        obj.show();
        m1();
	}
	
static {
	System.out.println("Inside static method executing before main method: "+i); //30
	i=100;
}
{
	System.out.println("Inside non-static method executing before main method: "+i); //100
}
}
