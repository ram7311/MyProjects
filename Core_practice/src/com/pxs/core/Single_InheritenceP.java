package com.pxs.core;

//public->protected->default->private
public class Single_InheritenceP {

	public int i;
	
	public void m1() {
		System.out.println("Parent");
	}

}
class Child extends Single_InheritenceP{
	
	public void m1() {
		System.out.println("Child");
		super.m1();
	}
	
	public static void main(String[] args) {

		Child c = new Child();
		c.m1();//child
		
		Single_InheritenceP p = new Child();
		p.m1();//child
		
		Single_InheritenceP parent = new Single_InheritenceP();
		parent.m1();

	}
	
}
