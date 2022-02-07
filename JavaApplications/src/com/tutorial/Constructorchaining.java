package com.tutorial;

class Parent5 {
	//int a = 30;

	Parent5() {
		this(3);
		System.out.println("in Parent Constructor ");
	}

	Parent5(int a) {
		this(45, "Sukanya1");
		System.out.println("in Parent Constructor : " + a);
	}

	Parent5(int a, String Name) {
		System.out.println("in Parent Constructor value is : " + a + " Name is : " + Name);
	}
}

class Child5 extends Parent5 {
	int a = 60;

	Child5() {
		this(10);
		System.out.println("in Child Constructor " + a);
	}

	Child5(int a) {
		this(20, "Sukanya");
		System.out.println("in Child Constructor : " + a);
	}

	Child5(int a, String Name) {
		System.out.println("in Child Constructor variable value A is : " + a + " Name is : " + Name);
	}
}

public class Constructorchaining {
	public static void main(String[] args) {
		Child5 obj = new Child5();

	}

}
