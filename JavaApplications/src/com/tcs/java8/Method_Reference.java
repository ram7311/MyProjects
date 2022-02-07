package com.tcs.java8;

interface Interf{
	public void display();
}

public class Method_Reference {

	public static void main(String[] args) {

		Interf i = ()->System.out.println("iterface implementation");//This is direct implementation but
		//if we want to mention m1() method implementation then go for below method reference
		i.display();
		Interf j = Method_Reference :: m1;//use static m1 method located in Method_Reference for implementation
		j.display();
		
		Method_Reference obj = new Method_Reference();
		Interf i2 = obj :: m2;//use non-static m2 method located in obj for implementation
		i2.display();
		
	}
	
	public static void m1() {
		System.out.println("This is m1 method");
		
	}
	public  String m2() {
		System.out.println("This is m2 method");
		return "no differenet";// no restriction with any return type but arguments should be same 
	}
}
