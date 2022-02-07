package com.report;


interface A{
	default void m1() {
		System.out.println("A");
	}
	static void m2() {
		System.out.println("A");
	}
}
interface B{
	default void m1() {
		System.out.println("B");
	}
}
public class Test implements A,B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.m1();
		A.m2();
	}

	@Override
	public  void m1() {
		// TODO Auto-generated method stub
		A.super.m1();
	}

}
