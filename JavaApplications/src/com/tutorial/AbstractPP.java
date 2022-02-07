package com.tutorial;
//instead of creation another concrete class then extends we can directly give implementation of show method in main method.
//Valid instantiation by defining all abstract method of an abstract class
abstract class AbstractSS{
	int i=30;                     // global variable
	abstract void show();         //abstract method
	static {                     // abstract class can have static block
		System.out.println(" In Static method");
	}

}

public class AbstractPP {
	public static void main(String[] args) {
		int i=70;
		AbstractSS obj=new AbstractSS() {
			void show() {
				System.out.println(" In Abstract method "+i);
			}
		};
		
		obj.show();
		System.out.println(" In show method " +i);
		
	}

}
