package com.tutorial;

class Aa{
	 int a=20;
	public void show(){
		System.out.println("In A-show method: "+a);
	}
	public void Display(){
		System.out.println("In A-Desplay method: "+a);
	}
}

class Ba extends Aa{
	int a=50;
	public void show(){		
		System.out.println("In B-show method: "+a);
		super.show();
	}
}
class Ca extends Ba{
	int a=70;
	public void show(){		
		System.out.println("In C-show method: "+a);
		super.show();
	}
}


public class MultilevelInheritanceP { 
	public static void main(String[] args) {
		Ca obj =new Ca();
		obj.show();
		obj.Display();
	}

}