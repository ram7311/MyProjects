package com.tutorial;

interface Bd{
	int a=50;
	 void show();
	}

class Ad implements Bd{
	 int a=20;
	public void show(){
		System.out.println("In A-show method: "+a);
	}
	public void Display(){
		System.out.println("In A-Desplay method: "+a);
	}}

class Cd extends Ad implements Bd{
	int a=70;
	public void show(){		
		System.out.println("In C-show method: "+a);
		super.show();
	}}

public class MultipleInheritanceP {
	public static void main(String[] args) {
		Bd obj1=new Cd();
		Ad obj=new Ad();
		obj1.show();
		obj.Display();
		
	}

}