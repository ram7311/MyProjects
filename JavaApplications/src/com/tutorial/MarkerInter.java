package com.tutorial;
//If interface doesn't contain any method or fields, implementation then interface is called as Marker interface.
//Marker interface is also known as Tag interface or Ability interface
interface P{
 void show();
}

class Demo {  
	public void show() {
		System.out.println("Hello");
	}
}


public class MarkerInter {

	public static void main(String[] args) {
		System.out.println("Inside main method");
		Demo obj=new Demo();
		if (obj instanceof P)  // Demo is not implementing interface so else condition will execute
		{
		   obj.show();
		   }
		else
		  {
			System.out.println("NO Interface");
		
		}

	}

}
