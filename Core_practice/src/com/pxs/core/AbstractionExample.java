package com.pxs.core;

//Abstraction --> Partial definition of Object --not 100%
//Class       --> Complete definition of Object --100%
//Interface   --> Specification of Object      --0%
abstract class Parent1 {

	public void concreteMethod() {
		System.out.println("Concreate Method");
	}

	public abstract void abstractMethod();
}

public class AbstractionExample extends Parent1 {

	public void abstractMethod() {
		super.concreteMethod();
		System.out.println("given body to abstractMethod");
	}

	public static void main(String[] args) {
		AbstractionExample obj = new AbstractionExample();
		obj.abstractMethod();
	}
}
