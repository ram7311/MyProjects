package com.tcs.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(0);
		a.add(5);
		a.add(10);
		a.add(15);
		a.add(20);
		a.add(25);
		for(int temp:a) {
			if(temp%2==0)
			System.out.println(temp);
		}
		
		List<Integer> collect = a.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(collect);//[0, 10, 20]
		
		int count=0;
		for(int temp:a) {
			if(temp>10)
			count++;
		}
		System.out.println(count);
		
		long l = a.stream().filter(i->i>10).count();
		System.out.println(l);//3
		
		for(int temp:a) {
			temp = temp+5;
			System.out.println(temp);
		}

		List<Integer> collect2 = a.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(collect2);//[5, 10, 15, 20, 25, 30]
		
		int minInteger = a.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(minInteger);
		
		int max = a.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(max);
		
	}

}
