package com.tutorial2.Multithreading;

public class ThreadGroupDemo extends Thread {
	public static void main(String[] args) {
		
System.out.println(Thread.currentThread().getThreadGroup().getName());  //main Thread
System.out.println(Thread.currentThread().getThreadGroup().getParent().getName()+"\n");   //System-Parent for the main thread

ThreadGroup g1=new ThreadGroup("First-Group");
System.out.println(g1.getParent().getName());   // main 

ThreadGroup g2=new ThreadGroup(g1,"Second-Group");
System.out.println(g2.getParent().getName());   //First group is parent for Second group

System.out.println(g1.getMaxPriority());

Thread t1= new Thread(g1,"First");
Thread t2= new Thread(g1,"second");
g1.setMaxPriority(3);
System.out.println(g1.getMaxPriority()); //3

System.out.println(t1.getPriority()); //5
System.out.println(t2.getPriority()); //5
	}

}
