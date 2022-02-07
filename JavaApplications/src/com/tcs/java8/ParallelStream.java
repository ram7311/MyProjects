package com.tcs.java8;

import java.util.stream.IntStream;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ParallelStream {

	public static void main(String[] args) {

		long start = 0;
		long end = 0;
		
		start = System.currentTimeMillis();
		
		IntStream.range(1, 1000).forEach(ParallelStream::m1);
		
		end = System.currentTimeMillis();
		
		System.out.println("Total time for normal stream === "+(end-start)+"\n------------------------");//takes 138 ms..prints all numbers asc
		
		
		start = System.currentTimeMillis();
		
		IntStream.range(1, 1000).parallel().forEach(ParallelStream::m1);
		
		end = System.currentTimeMillis();
		System.out.println("Total time for Parallel stream === "+(end-start)+"\n------------------------");// takes 54ms..we can't expect order
		
		IntStream.range(1, 10).forEach(i->System.out.println("Thread : "+Thread.currentThread().getName()+" "+i));//it uses main thread only
		IntStream.range(21, 30).parallel().forEach(i->System.out.println("Thread : "+Thread.currentThread().getName()+" "+i));//it uses main and worker threads
		
	}
	
public static void m1(int a) {
	
	System.out.println("-->"+a);
	
}
}
