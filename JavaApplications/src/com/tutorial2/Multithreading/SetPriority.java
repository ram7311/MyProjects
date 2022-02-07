package com.tutorial2.Multithreading;


class MyThread4 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<3;i++)
			System.out.println("In Child Thread"); 
	}
}
public class SetPriority {

	public static void main(String[] args) {	
  System.out.println(Thread.currentThread().getPriority());
  
        MyThread4 t1=new MyThread4();
        t1.setPriority(8);
    System.out.println(t1.getPriority());
     t1.start();
     for(int i=0;i<3;i++)
			System.out.println("In main Thread"); 
	}
  
  
	}

