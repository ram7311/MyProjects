package com.tutorial1.ExceptionHandling;

public class ExceptionPropagationandThrow {

	public static void Eligibity(int age) {
		if( age<18) { 
			throw new ArithmeticException("Your not eligible to Vote");} // Throwing unchecked exception with note
			else {
				System.out.println(" Your eligible to Vote");
			}}


	public static void m1() {
	
		int c=50/0;
	}
	public static void n1() {
		m1();
	}
	
	
   public static void p1() {
	   try {
			n1();	
   }
	   catch(ArithmeticException e) {
		   System.out.println("exception handled");
	   }}

	public static void main(String[] args) {
		Eligibity(89);
		p1();
		System.out.println(" Notmal flow");
	}

}
