package com.pxs.core.exceptions;

import java.util.Scanner;

public class CustomizedException {

	public static void main(String[] args) {

		int count = 10;
		
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		try {
			
			if (input >= count)
				throw new MyException("the given input is greater than 10");
			else
				System.out.println("Done");
		
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
