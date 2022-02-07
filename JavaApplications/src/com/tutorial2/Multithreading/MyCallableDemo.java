package com.tutorial2.Multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallableP implements Callable{
     int num;
     MyCallableP(int num){
    	 this.num=num;
     }    
	@Override
	public Object call() throws Exception {
		System.out.println(Thread.currentThread().getName()+ "is responsible to find the sume of the firist " +num+ " numbers");
		
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum=sum+i;
		}
		return sum;
	}	
}


public class MyCallableDemo {

	public static void main(String[] args) throws Exception{
		
		MyCallableP[] jobs= { 
				              new MyCallableP(10),
				              new MyCallableP(20),
				              new MyCallableP(30),
				              new MyCallableP(40),
				              new MyCallableP(50)};
	
	ExecutorService service= Executors.newFixedThreadPool(3);
	for(MyCallableP job:jobs) {
		Future f=service.submit(job);
		System.out.println(f.get());
	}
	service.shutdown();
	}

}
