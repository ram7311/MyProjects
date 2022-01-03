package com.pxs.core.exceptions;

public class ExceptionPropagation {

	public static void main(String[] args) {
		name1();
	}

	public static void name1() {
		try {
			name2();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	public static void name2() {
		name3();
	}

	public static void name3() {

		throw new ArithmeticException("bad Exception");
	}

}
