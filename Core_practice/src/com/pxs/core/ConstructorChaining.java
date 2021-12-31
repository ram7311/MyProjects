package com.pxs.core;
//Super,super(),this,this() are must be used in non static area only.
class Parent {
	int p=4000;
	public Parent() {
		this(100);
		System.out.println("Parent");
		
	}
	public Parent(int a) {
		this(100, "babu rao");
		System.out.println("Parent with a parameter");
		
	}
	public Parent(int a,String b) {
		System.out.println("Parent with a,b parameter");
		
	}
}
class Childd2 extends Parent{

	int c=2000;
	public Childd2() {
		this(10);
		
		System.out.println("Childd2 "+this.c+" "+super.p);

	}

	public Childd2(int a) {
		this(10, "ram");
		System.out.println("Childd2 with a parameter");

	}

	public Childd2(int a, String b) {
		super();
		System.out.println("Childd2 with a,b parameter");

	}

}
	 
public class ConstructorChaining {

	public static void main(String[] args) {

		Childd2	ch=	new Childd2();
	}

}
