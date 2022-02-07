package com.tutorial2.Multithreading;

//If thread wants to wait till another thread's to completing execution is called Join() method.
// There may be a chance to through the exception by join() so we need to handle it using throws.
//There are 3 types of join() methods
//            1.public final void join();
//            2.public final void join( long ms);
//            3.public final void join(long ms, int ns);-- occurate time
// From Running state it will entered into Waiting state to complete other thread execution then again it wil come back to Running state in Thread-Life Cycle.
          //Once the Other Thread completes execution
          //If the time expires
          //If Waiting thread get interrupted---It will comes to Running state back.

class MyThread6 extends Thread{
	@Override
	public void run() {
		for (int i=0;i<3;i++) {
			System.out.println("in Child Thread");
			
		}
	}
}


public class JoinMethodPCase1 {

	public static void main(String[] args) throws InterruptedException {
		MyThread6 t= new MyThread6();
		t.start();
		t.join();  // main thread waits till child threads to completes the execution
		for (int i=0;i<3;i++) {
			System.out.println("in Main Thread");
		}

	}

}
