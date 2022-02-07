package com.tutorial;

//MethosOverring is also know as know as Run-time polymorphism or Dynamic Polymorphism or Late Polymorphism
//Object is decided by the JVM not compiler so it's called as runtime polymorphism.

class DemoMP{
	public void show() {
		System.out.println("in method-1 ");
	}
}

class DemoKP extends DemoMP{
	public void show() {
		System.out.println("in  method-2 ");
	}
}


public class MethidOverriding {

	public static void main(String[] args) {
		DemoMP p =new DemoMP();  //in  method-1
		p.show();
		
		DemoKP c =new DemoKP();  //in  method-2
		c.show();
		
		DemoMP p1=new DemoKP();     //in  method-2
		p1.show();      ///Object is child class so Print statement will be executed from DemoKP

	}

}
