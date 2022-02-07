package com.tutorial1.ExceptionHandling;

import java.util.Scanner;

public class CustomisedExceptionP {

	public static void main(String[] args) {
		int count = 10;
		System.out.println("Enetr input value: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
try {
		if (input > count) {
			throw new MyExceptionn("Input is gretaer than count");
		} else {
			System.out.println("Input is lesser than count");
		}

	}
catch(Exception e) {
	System.out.println(e.getMessage());
}
	}
}
