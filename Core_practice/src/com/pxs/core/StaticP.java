package com.pxs.core;


//static variable,method,block,different invoking
public class StaticP {
	

	static int i;//global
	public static void main(String[] args) {
		int i=20;
		System.out.println("static i :"+i);//20
		m1();
		StaticP obj = new StaticP();
		System.out.println("calling static variable by object :"+obj.i);//100
	}
	
	public static void m1() {
		System.out.println("m1 static i :"+StaticP.i);//100
	}
	
	static {
		System.out.println("static block execute before main method");
		StaticP.i=100;
	}

}
