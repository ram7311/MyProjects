package com.tutorial2.Multithreading;


// If non-daemon is terminated then daemon won't be executed

class MyThreadB extends Thread{
	public void run() {
		for (int i=0;i<5;i++) {
			System.out.println("in Child thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}

public class DaemonThread2 {

	public static void main(String[] args) {  // non daemon thread
		MyThreadB t= new MyThreadB();
		t.setDaemon(true); //             // daemon thread
		t.start();
		System.out.println("End of Main thread");
	}

}
