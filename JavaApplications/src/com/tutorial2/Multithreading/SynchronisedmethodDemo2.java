package com.tutorial2.Multithreading;

class Display{
	public synchronized void  Displayn() {
		//public synchronized void Displayn() {
		for(int i=0;i<=5;i++) {
			System.out.print(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	//public synchronized void Displayc(){
	public synchronized void Displayc(){
		for(int i=65;i<75;i++) {
			System.out.print((char)i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Mythread10 extends Thread{
	Display d;
	Mythread10(Display d){
		this.d=d;
	}
	public void run() {
			d.Displayn();		
	}
}

class Mythread11 extends Thread{
	Display d;
	Mythread11(Display d){
		this.d=d;
	}
	public void run() {
		d.Displayc();		
	}
}


public class SynchronisedmethodDemo2 {
	public static void main(String[] args) {
		Display d=new Display();
		Mythread10 t1=new Mythread10(d);
		Mythread11 t2= new Mythread11(d);
		t1.start();
		t2.start();
	}

}
