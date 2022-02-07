package com.tutorial2.Multithreading;

class MyThread2 extends Thread{
	
}

public class ThreadSetterGetter {
	public static void main(String[] args) {
		MyThread2 t1= new MyThread2();
		MyThread2 t2= new MyThread2();
		MyThread2 t3= new MyThread2();
		
		System.out.println("First Names" +"\n");
	    System.out.println(t1.getName());
		System.out.println(t2.getName());
		System.out.println(t3.getName());
		System.out.println(Thread.currentThread()+"\n");
		
		t1.setName("Sukanya-1");
		t2.setName("Sukanya-2");
		t3.setName("Sukanya-3");
		
		System.out.println("After setting new name" +"\n");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		System.out.println(t3.getName());
	}

}
