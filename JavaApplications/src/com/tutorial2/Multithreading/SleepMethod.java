package com.tutorial2.Multithreading;

//basic example of multithreading

class Mythread1 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("In child Thread");
		try {
			Thread.sleep(1000);       //Make Thread sleep for 1 sec
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
	
}


public class SleepMethod {

	public static void main(String[] args) throws InterruptedException {
		Mythread1 t= new Mythread1();
	     t.start();
		for(int i=0;i<5;i++) {
			System.out.println("In main Thread");
		Thread.sleep(1000);         //Make Thread sleep for 1 sec
	}
	}
	}


