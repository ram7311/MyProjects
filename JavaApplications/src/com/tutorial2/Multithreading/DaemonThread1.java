package com.tutorial2.Multithreading;

class MyThreadA extends Thread{
	
}

public class DaemonThread1 {

	public static void main(String[] args) {
		MyThreadA t= new MyThreadA();
		System.out.println(Thread.currentThread().isDaemon());  //False
		//Thread.currentThread().setDaemon(true);                  // can't set for main thread
		 System.out.println(t.isDaemon());  //false since the parent is non daemon
		 t.setDaemon(true);
		 System.out.println(t.isDaemon());  //true
	}

}
