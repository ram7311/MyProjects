package com.tcs.java8;
import java.util.function.Function;

public class FunctionP {
	
	public static void main(String[] args) {
		
		Function<Integer, String> f = i->i>100?"high":"low";
		System.out.println(f.apply(1));//low
		System.out.println(f.apply(101));//high
	}
	
	

}
