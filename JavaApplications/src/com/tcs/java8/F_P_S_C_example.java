package com.tcs.java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Std{
	String name;
	int age;
	public Std(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
public class F_P_S_C_example {

	public static void main(String[] args) {

		Function<Integer, String> f = s->s>=18?"major":"minor";
		Predicate<Std> p = s->s.name!=null && s.age!=0;
		Supplier<String> s = ()->"Supplier is providing data";
		
		Std[] std = { new Std("raj",9),
				      new Std("sam",18),
				      new Std("hari",13),
				      new Std("indhu",21)
				      };
		
		Consumer<Std[]> c = l->{
			
			System.out.println(s.get());//supllier
			for(Std st:l) {
				if(p.test(st))
					System.out.println(f.apply(st.age));//function
			}
		};
		
		c.accept(std);
		}

}
