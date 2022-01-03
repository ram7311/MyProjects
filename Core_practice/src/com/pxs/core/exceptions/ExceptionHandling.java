package com.pxs.core.exceptions;

public class ExceptionHandling {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		try {

			int c = a / b;
			System.out.println(c);
			
		} 
		catch (ArithmeticException e) {//Exception heirarchy must follow as per daigram in resources..eg child(ArithmeticException),parent(RuntimeException)
			System.out.println("value is infinity");
		}
		catch (RuntimeException e) {
			System.out.println("value is infinity");
		}
		finally {
			b=3;
			System.out.println("b value changed to "+b);
		}
		
	}

}
