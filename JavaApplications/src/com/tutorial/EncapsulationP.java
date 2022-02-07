package com.tutorial;

// Binding data with methods inside a single unit that is class is called Encapsulation.
// Data hiding+ Abstraction is called as Encapsulation
//Abstraction is hiding internal implementation details just showing user defined things.
//If we want to access private data can be through Getter and setter methods.

class DemoS{
	private int rollno;
	private String name;// data hiding
	
	public void setrollno(int a) {
		rollno=a;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	
	public int getrollno() {
		return rollno;
	}
	public String getname() {
		return name;
	}
}
public class EncapsulationP {

	public static void main(String[] args) {
		DemoS obj=new DemoS();
		obj.setrollno(3);
		obj.setname("Sukanya");
        System.out.println(obj.getrollno());
        System.out.println(obj.getname());
	}

}
