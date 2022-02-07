package com.tutorial2.Multithreading;

//

class display1{
	public void  wish(String name) {    //can method will be synchronized
		//synchronized(this) {
		synchronized(display1.class) {
		for(int i=0;i<=5;i++) {
			System.out.print("Good morning: ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}}
	}}

class Mythread13 extends Thread{
	display1 d;
	String name;
	Mythread13 (display1 d, String name){  //Creating constructor
		this.d=d;
		this.name=name;
	}
	public void run() {
			d.wish(name);		
	}
}


   public class SynchronisedblockDemo3 {
	public static void main(String[] args) {
		display1 d=new display1();
		//display1 d1=new display1();
		
		Mythread13 t1=new Mythread13(d,"Sukanya");
		Mythread13 t2= new Mythread13(d,"Pallavi");
		
		//Mythread13 t2= new Mythread13(d1,"Pallavi");
		
		t1.start();
		t2.start();
	}
}
