package com.tutorial5.java8;

import java.util.function.Function;

public class FunctionChainingP {

	public static void main(String[] args) {
		Function<Integer,Integer> f1= i-> i*2;
		Function<Integer,Integer> f2= i-> i*i*i;
		System.out.println(f1.andThen(f2).apply(2)); //64  f1 follows by f2
		System.out.println(f1.compose(f2).apply(2)); //16  f2 follows by f1
	}

}
