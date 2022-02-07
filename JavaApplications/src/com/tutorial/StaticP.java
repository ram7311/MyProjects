package com.tutorial;

class Student {
	
	static int i=10;            //Static Variable
	public void show() {       // non static method
		 i=20;                 // overide
		System.out.println("non_static method i is:"+i); //20
	}
	
	static void m1() {             //Static Method
		System.out.println("static method i is:"+i); //20
	}
}


public class StaticP{	
public static void main(String[] args) {
	System.out.println("The value for i is:"+Student.i); //10
	Student obj= new Student();
	obj.show();
	Student.m1();
}

static {                            //Static block will be executed before Main method
	System.out.println("Inside static block:"+Student.i); //10
}
}