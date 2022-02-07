package com.tutorial1.ExceptionHandling;

public class ThrowThrowsP {

	public static void main(String[] args) throws Exception {
	m1();

	}
	
	public static void m1() {
		System.out.println("Inside the Static method");
		throw new ArithmeticException("Exception Occured");
		
	}

}
