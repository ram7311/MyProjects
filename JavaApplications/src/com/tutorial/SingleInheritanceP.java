package com.tutorial;
//public->protected->default->private....security
//private->default->protected->public..visibility..in inheritance we have to increase visibility not security ...i.e..achieved below


class Ap{
	 int a=20;
	public void show(){
		System.out.println("In A-show method: "+a);
	}
	public void Display(){
		System.out.println("In A-Desplay method: "+a);
	}
}


class Bp extends Ap{
	int a=50;
	public void show(){		
		System.out.println("In B-show method: "+a);
		super.show();
	}
}

public class SingleInheritanceP {
	public static void main(String[] args) {
		Bp obj=new Bp();
		obj.show();
		obj.Display();
	}
}