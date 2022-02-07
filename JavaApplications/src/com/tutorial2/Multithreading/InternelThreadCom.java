package com.tutorial2.Multithreading;

class ThreadB extends Thread{
	int total=0;
	public void run() {
		synchronized(this) {
			System.out.println("child thread starts execution");		
		for(int i=1;i<=100;i++) {
			total=total+i;
		}
		System.out.println("Child thread trying to give notification");
		this.notify();
	}
}
}
public class InternelThreadCom {

	public static void main(String[] args) throws InterruptedException {
	
		ThreadB b=new ThreadB();
		b.start();
		//Thread.sleep(10000); //output can't be printed since the notification is released when main thread is in sleep.
		synchronized(b) {
		System.out.println("main thread calling child thread");	
		b.wait();
		//b.wait(10000); //If no notification is present then remaining part will be continued
		System.out.println("main thread notified");	
		System.out.println(b.total);
	}

}}