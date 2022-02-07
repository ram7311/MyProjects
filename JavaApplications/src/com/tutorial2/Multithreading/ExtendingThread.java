package com.tutorial2.Multithreading;

class MyThread extends Thread{
	@Override
	 public void run() {                                 //start() method always executes no argument run method
		for(int i=0; i<10;i++) {
        System.out.println("In Child Thread");
        }
    }
//	 public void start() {                                 //start() method always executes no argument run method
//			for(int i=0; i<5;i++) {
//	        System.out.println("In Child-1 Thread");
//	        }
	     void run( int a) {
			for(int j=0; j<5;j++) {
	        System.out.println("In Child-2 Thread");     // Won't be printed since it is overloading. 
	        }
}}
public class ExtendingThread {

	public static void main(String[] args) {
//		System.out.println(Thread.currentThread().getPriority());
//         Thread.currentThread().setPriority(10);
//         System.out.println(Thread.currentThread().getPriority());
		
		MyThread t=new MyThread();
		t.start();
		for(int i=0; i<10;i++) {
		System.out.println("In Main Thread");}
		//t.start();//After starting the Thread if we try to start again "IllegalThreadStateException" will throw
	}
	}

