package com.tutorial;

abstract class Base {
	//abstract void show();  //Abstract method
	void display() {
		System.out.println("In Abstract method"); //non abstract method		
	}
	Base(){                                         // Constructor
		System.out.println("In Base Constructor");
	}
	 void m1() {
		System.out.println("In M1 method");
	}
	
	final void m2() {                             //Final method
	   System.out.println("In M2 Final method");
	}
	
	static void m3() {                            // Static methods
	  System.out.println("In M3 method");}
	 
	  static {
			System.out.println(" In Static method1");
		}
	}
class AbstractPrac extends Base{
	AbstractPrac() {              // Constructor
		System.out.println("In Dervided Constructor");
	}
	void show() {                 //non abstract method		
		System.out.println("In Extended Abstract method");
	}
	  static {
			System.out.println(" In Static method2");
		}
	
}

class Main extends Base {
	//final void m2() {                                    // can't overrode final method
		 //  System.out.println("In M2 Final method");
		//}
	}

public class AbstractP {

	public static void main(String[] args) {
		AbstractPrac obj=new AbstractPrac(); // Both Constructors will be called when object is created
        obj.show();
        obj.display();
        
        Base m=new Main();// reference can be Base or Main
        m.m1();                    // it will not work when Abstract method is present in Abstract class
        m.m2();
        
        Base.m3(); // can have static method. no need to create object for it directly we can call by it's class name.
	}

}
