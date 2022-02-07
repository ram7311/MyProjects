package com.tutorial;

class As{
	 int a=20;
	public void show(){
		System.out.println("In A-show method: "+a);
	}
	public void Display(){
		System.out.println("In A-Desplay method: "+a);
	}}
class Bs extends As{
	int a=50;
	public void show(){		
		System.out.println("In B-show method: "+a);
		super.show();
	}}

class Cs extends As{
	int a=70;
	public void show(){		
		System.out.println("In C-show method: "+a);
		super.show();
	}}

public class HierarchyInheritanceP {
	public static void main(String[] args) {
		Bs obj=new Bs();
		Cs obj1=new Cs();
		obj.show();
		obj1.show();
		obj1.Display();
	}

}