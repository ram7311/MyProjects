package com.tutorial1.ExceptionHandling;

//Exception heirarchy must follow eg child(ArithmeticException),parent(RuntimeException)
public class MultipleExceptions {

	public static void main(String[] args) {
		
	    try{
	       int b[]=null;
	       int a[]=new int[6];
	       a[29]=5;    // Only first exception will be executed and catch 
	        b[7]=5;
	        int i=10;
	        int j=0;
	        int k= i/j;
	        System.out.println("Output is "+k);
	      }
	        
	    catch(ArithmeticException e){
	        System.out.println("Divide by Zero error");
	    }
	    
	   catch(ArrayIndexOutOfBoundsException e){
	       System.out.println("Out of range error"); // will be printed
	    }
	     catch(RuntimeException e){
	       System.out.println("null pointer exception");
	    }
	    finally{
	        System.out.println("Program is executed successfully");
	       
	    }
	}}

