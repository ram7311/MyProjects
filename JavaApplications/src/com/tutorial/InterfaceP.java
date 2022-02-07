package com.tutorial;

interface Writer{
	default void write(){
		
	 }
}

class Pen implements Writer {
	public void write() {
		System.out.println("in Pen Class");
	}
	 
 }

class Pencil extends Pen implements Writer{
	public void write() {
		super.write();
		System.out.println("in Pencil Class");
	}
	 
 }

class Kit {
	public void dosomething(Writer p) {
		p.write();
		System.out.println("in Kit Class");
	}
	 
 }
public class InterfaceP {
	public static void main(String[] args) {
		Kit k=new Kit();
		Writer p =new Pen();
		Writer pc=new Pencil();
		k.dosomething(pc);
		k.dosomething(p);
	}
}
