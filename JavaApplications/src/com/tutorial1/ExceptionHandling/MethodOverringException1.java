package com.tutorial1.ExceptionHandling;

//If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception but it can declare unchecked exception.
//If the superclass method declares an exception, subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.
class Parent7{
	public static void ExceptionA() throws Exception {
		System.out.println("Inside Static method1");
	
	try {
		
	}
	catch(Exception  e) {
		
	}}

}




public class MethodOverringException1 extends Parent7 {
	public static void  ExceptionA() throws ArithmeticException { // It will work since it is Unchecked Exception
	//public static void  ExceptionA() throws IOException// not possible for Checked Exceptions
		System.out.println("Inside Static method2");
	}
	
		
	public static void main(String[] args) {
		ExceptionA();

	}

}
