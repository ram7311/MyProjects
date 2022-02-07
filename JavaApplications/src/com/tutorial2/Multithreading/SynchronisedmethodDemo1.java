package com.tutorial2.Multithreading;

//

class Displayy{
	public synchronized void  wish(String name) {
		for(int i=0;i<=5;i++) {
			System.out.print("Good morning: ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}}

class Mythread12 extends Thread{
	Displayy d;
	String name;
	Mythread12 (Displayy d, String name){  //Creating constructor
		this.d=d;
		this.name=name;
	}
	public void run() {
			d.wish(name);		
	}
}


   public class SynchronisedmethodDemo1 {
	public static void main(String[] args) {
		Displayy d=new Displayy();
		//Displayy d1=new Displayy();
		
		Mythread12 t1=new Mythread12(d,"Sukanya");
		Mythread12 t2= new Mythread12(d,"Pallavi");
		
		//Mythread12 t2= new Mythread12(d1,"Pallavi");
		
		t1.start();
		t2.start();
	}
}
