package com.tutorial;
//Polymorphism is many behavior at a time.
//MethosOverriding and Method Overloading is combindly known as Polymorphism.
//Compile time polymorphismm since the values are assigned at compilation time

class Overloading{
	public void show(int a) {
		System.out.println("in Method-1 "+a);
	}
}
class OverloadingP extends Overloading{
public void show() {
	System.out.println("in Method-2");
}
}

public class MethodOverloading {

	public static void main(String[] args) {
		OverloadingP obj1=new OverloadingP();
        obj1.show(); // since no argument is passed method-2 will be printed
        obj1.show(3);// based on the argument passed method-1 will be printed
	}

}
