package com.tutorial2.Multithreading;

// Parent and Child Threads are waiting to complete execution.Than Program will be strucked is called DeadLock situation.
//Example for Dead lock method
class MyThread8 extends Thread{
	static Thread mt;
	@Override
	public void run() {
		try {
			mt.join();                            //Child Thread is Waiting untill main Threads to complete.
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		for (int i=0;i<3;i++) {
			System.out.println("in Child Thread");
			
		}
	}
}

public class JoinMethodPCase3Deadlock {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread8.mt=MyThread8.currentThread();
		MyThread8 t= new MyThread8();
		t.start();
		t.join();                         //Main Thread is Waiting untill child Threads to complete.
		for (int i=0;i<3;i++) {
			System.out.println("in Main Thread");
		}

	}

}
