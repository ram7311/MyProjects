package com.pract;

public class Noofoccurance {

	public static void main(String[] args) {
		String str2= "Aaaaabdbcceddjhgjhg";
		String str= str2.toLowerCase();
		getCharoccurance(str,'a');
		
		
	}
	public static void getCharoccurance(String str,char val) {
		int count=0;
		for(char ch: str.toCharArray()) {
			if (ch== val) {
				count++;
			}
			
		}
		System.out.println("no of occurance of " +val+ " is " +count);
	}

}
