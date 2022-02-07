package com.tcs.java8;

import java.util.Optional;

//Optional is final class it will deal with NullPointerException, it has several methods to handle
public class OptionalEx1 {

	public static void main(String[] args) {
		String s1="hello";
		String s2=null;
		
		//ways to create optional object -->empty,of,ofNullable
		
		//empty
		Optional<Object> emptyOptional = Optional.empty();
		System.out.println(emptyOptional);
		//of
		//Optional<String> of = Optional.of(s2);
		//System.out.println(of); //Throws java.lang.NullPointerException
		
		//ofNullable
		Optional<String> ofNullable = Optional.ofNullable(s1);
		if (ofNullable.isPresent()) {
			System.out.println(ofNullable.get());//hello
			
		}
		Optional<String> ofNullable2 = Optional.ofNullable(s2);
		System.out.println(ofNullable2.orElse("no value is there"));
		
		System.out.println(ofNullable2.map(String::toUpperCase).orElse("unable to make it uppercase becoz it is null"));
		System.out.println(ofNullable2.orElseThrow(()->new IllegalArgumentException("not value is exist in the given object")));
		
	}

}
