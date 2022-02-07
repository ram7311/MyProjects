package com.tutorial;


//Method hiding is also know as Compiler-time polymorphism or Static Polymorphism or Early Polymorphism
////Reference is decided by the compiler not not JVM so it's called as compile-time polymorphism.
class DemoM{
	public static void show() {  
		System.out.println("in Static method-1 ");
	}
}

class DemoK extends DemoM{
	public static void show() {
		System.out.println("in Static method-2 ");
	}
}

public class Methodhiding {
public static void main(String[] args) {
	DemoM p =new DemoM();
	p.show();
	
	DemoK c =new DemoK();
	c.show();
	
	DemoM p1=new DemoK(); ///reference is Parent class so Print statement will be executed from DemoM
	p1.show();            // Reference type is decided by Compiler not JVM
	                      //// Since it is Static to static method calling JVM hide show method in DemoK it prints Parent class show method
}
}
