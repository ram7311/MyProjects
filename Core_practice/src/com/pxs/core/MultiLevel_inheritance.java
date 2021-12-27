package com.pxs.core;


class Animal{
	
	public void action() {
		System.out.println("in Animal");
	}
}

class Dog extends Animal{
	
	public void bow() {
		super.action();
		System.out.println("Dog Bow");
	}
}

class Puppy extends Dog{
	
	public void action() {
		super.action();
		System.out.println("in Puppy");
	}
}

public class MultiLevel_inheritance {
	
	public static void main(String[] args) {

		Puppy p = new Puppy();
		p.action();
		p.bow();
	}

}
