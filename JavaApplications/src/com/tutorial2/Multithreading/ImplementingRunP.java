package com.tutorial2.Multithreading;

class Myrunnable implements Runnable  {

	@Override
	public void run() {
		for(int i=0; i<2;i++)
		System.out.println("In child Thread");	
	}}

public class ImplementingRunP {

	public static void main(String[] args) {
		Myrunnable r= new Myrunnable();    // child Thread can't be called if we comment this line
		Thread t1=new Thread(r);
		Thread t2= new Thread(r);
				
		t1.start();                      // New thread will be created run() form Thread class will be executed
		for(int i=0; i<2;i++)    
			 System.out.println("in Main-1 Thread");
		
		t1.run();                      // Thread won't be created run() will be executed normally
		for(int i=0; i<3;i++)    
			 System.out.println("in Main-2 Thread");
		
		t2.start();                      // New thread will be created run() form Thread class will be executed
		for(int i=0; i<2;i++)    
			 System.out.println("in Main-3 Thread");
		
		//r.start();                   // won't work
		r.run();                      //Thread won't be created run() will be executed normally
	}}
