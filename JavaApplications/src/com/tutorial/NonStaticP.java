package com.tutorial;

public class NonStaticP {

	static int i;
	public static void main(String[] args) {
		
		NonStaticP obj = new NonStaticP();
		System.out.println("non static i :"+obj.i);
		obj.m1();
	}
	
	public void m1() {
		System.out.println("m1 non static i :"+i);
	}
	
	{
		System.out.println("non static block 1 execute before main method");
		i=100;
	}
	{
		System.out.println("non static block 2 execute before main method");
		i=200;
	}

}
