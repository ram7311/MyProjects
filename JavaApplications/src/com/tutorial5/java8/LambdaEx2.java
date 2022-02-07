package com.tutorial5.java8;

interface Interfa{
	public int m1(int a, int b);
}

//class Demo4 implements Interfa{
//	public void m1(int a,int b) {
//		System.out.println("Sum of no :" +(a+b));
//	}
//}



public class LambdaEx2 {

	public static void main(String[] args) {
//		Interfa n= (a, b)-> System.out.println("Sum of no :" +(a+b));
//		n.m1(5, 8);
		Interfa n= (a, b)->  a+b;
		System.out.println("Sum of no: "+n.m1(5, 8));
	}
}
