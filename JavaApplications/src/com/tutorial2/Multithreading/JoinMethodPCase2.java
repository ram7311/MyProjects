package com.tutorial2.Multithreading;



class MyThread7 extends Thread{
	static Thread mt;
	@Override
	public void run() {
		try {
			mt.join();                            //Child Thread id Waiting untill main Threads to complete.
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		for (int i=0;i<3;i++) {
			System.out.println("in Child Thread");
			
		}
	}
}


public class JoinMethodPCase2 {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread7.mt=MyThread7.currentThread();
		MyThread7 t= new MyThread7();
		t.start();
		
		for (int i=0;i<3;i++) {
			System.out.println("in Main Thread");
		}

	}

}
