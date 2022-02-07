package com.tutorial5.java8;

// If already implementation is present then should go for method reference
// If no implementation then Lambda expression


interface Interfe{
	public void add(int x, int y);

	
}



public class Methodreference {

	public void sum(int a, int b) {
		System.out.println("The sume of two numners " +(a+b));
	}
	
	
	public static void main(String[] args) {
		
		Interfe f= (x,y)-> System.out.println("The sum is "+(x+y)); // using Lambda expression
		f.add(10,20);
		
		//Interfe f1= Methodreference :: sum;   // reusing the existing method if it is static method
		Methodreference m= new Methodreference(); // If it not static
		Interfe f1= m :: sum; 
		
		f1.add(20, 30);
	}

}
