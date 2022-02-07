package com.tutorial5.java8;

interface Interf{
	public void m1();
}
//class Demo3 implements Interf{
//	public void m1() {
//		System.out.println("inside abstract method");
//	}
//}
public class LambdaEx {

	public static void main(String[] args) {
		Interf m= ()-> {System.out.println("inside abstract method");
				};
				m.m1();
				}

	}



