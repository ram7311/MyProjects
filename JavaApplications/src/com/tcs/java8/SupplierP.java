package com.tcs.java8;
import java.util.function.Supplier;

public class SupplierP {
	
	public static void main(String[] args) {
		
		Supplier<Integer> s = ()->{
			
			return (int)(Math.random()*10);
		};
		
		System.out.println(s.get());
	}

}
