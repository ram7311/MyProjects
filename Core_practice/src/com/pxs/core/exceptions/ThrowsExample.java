package com.pxs.core.exceptions;

public class ThrowsExample {

	public static void main(String[] args) throws Exception {
		
		method();
	}
	
	public static void method() {
			
			throw new ArithmeticException("infinity");
	}

}
