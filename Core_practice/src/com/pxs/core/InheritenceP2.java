package com.pxs.core;

//public->protected->default->private....security
//private->default->protected->public..visibility..in inheritance we have to increase visibility not security ...i.e..achieved below
public class InheritenceP2 {

	public final int i = 1000;
	
	protected  void m1() {
		System.out.println("Parent");
	}

}
class Child2 extends InheritenceP2{
	
	public final void m1() {
		System.out.println("Child");
	}
	
	public static void main(String[] args) {

		Child2 c = new Child2();
		System.out.println(c.i);
		c.m1();//child
		

	}
	
}
