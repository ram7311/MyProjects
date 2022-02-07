package com.tcs.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(0);
		a.add(25);
		a.add(15);
		a.add(10);
		a.add(20);
		a.add(5);
		
		//Collections.sort(a);
		//System.out.println(a);
		
		//Collections.reverse(a);
		//System.out.println(a);
		
		List<Integer> collect = a.stream().sorted().collect(Collectors.toList());
		System.out.println(collect);//[0, 5, 10, 15, 20, 25] ..ascending order
		
		List<Integer> collect2 = a.stream().sorted((i1,i2)->(i1<i2?-1:i1>i2?1:0)).collect(Collectors.toList());
		System.out.println(collect2);//[0, 5, 10, 15, 20, 25] ..ascending order
		
		List<Integer> collect3 = a.stream().sorted((i1,i2)->(i1>i2?-1:i1<i2?1:0)).collect(Collectors.toList());
		System.out.println(collect3);//[25, 20, 15, 10, 5, 0] ..descending order
		
		ArrayList<String> b = new ArrayList<String>();
		b.add("X");
		b.add("C");
		b.add("B");
		b.add("A");
		b.add("Z");
		b.add("D");
		
		List<String> collect4 = b.stream().sorted((e1,e2)->e1.compareTo(e2)).collect(Collectors.toList());
		System.out.println(collect4);
		
		List<String> collect5 = b.stream().sorted((e1,e2)->e2.compareTo(e1)).collect(Collectors.toList());
		System.out.println(collect5);
		
	}

}
