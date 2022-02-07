package com.tutorial2.Multithreading;

//Yield method causes to pause the or stop the current execution to give chance to the other threads having same priority.
//If no waiting thread or waiting thread have same or low priority then will continue the execution.
//If multiple threads are waiting with the same priority then TS decides which need to be executed.
//Method which yielded when it will get chance means it depends on TS(Thread Scheduler)
//Once it's entered into running state when it is yielded then it will come to Ready state to wait to start the execution again in the Thread-LifeCycle
//public static native void yield();

class MyThread5 extends Thread{
	@Override
	public void run() {
		for (int i=0;i<3;i++) {
			System.out.println("in Child Thread");
			Thread.yield();   //Each time it will pass the execution
		}
	}
}


public class YieldMethosP {

	public static void main(String[] args) {
		MyThread5 t= new MyThread5();
		t.start();
		for (int i=0;i<3;i++) {
			System.out.println("in Main Thread");
		}

	}

}
