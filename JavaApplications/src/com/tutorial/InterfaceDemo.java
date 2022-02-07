package com.tutorial;

interface Xyz{
	public void show();	
}
interface Zxy{
	public void show();	
}

class InterfaceFinal implements Xyz,Zxy{
	public void show() {
		System.out.println("In Show method");
		
	}
	public void Display() {
		System.out.println("In Display method");
		
}
}
public class InterfaceDemo{
    public static void main(String[] args) {
    	System.out.println("In Main method");
    	Xyz obj=new InterfaceFinal();
    	obj.show();
    	//obj.Display();// we can ristrict the method calling by giving interface reference
    	
  
}
}