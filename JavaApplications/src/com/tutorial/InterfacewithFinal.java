package com.tutorial;
/// If we want to access only show() it should be from obj of Su.SInce it is interface we cant't create object
//we will use reference of interface

//Interfaces used for security to restrict calling methods
//used to use multiple inheritance in java
//By default inside interface everything will be public abstract methods. no need to mention it.

interface Su{
	//int a;  it won't take since it is declared only. 
	//every variable inside the interface should be initialised.
	int a=4;// By default it is final variable
	void show();
}

class DemoP implements Su{
	public void show() {
		// a=8;  // We caan't initialise again final variables
		System.out.println("Inside demo class : "+a);
	}	
}

public class InterfacewithFinal {

	public static void main(String[] args) {
		Su obj=new DemoP();
		obj.show();

	}

}
