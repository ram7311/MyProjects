package com.tutorial1.ExceptionHandling;
//Finally will be executed even though Exception is not handled
public class ArithmeticExceptionP {

	public static void main(String[] args) {
		
	    try{
	        int i=10;
	        int j=0;
	        int k= i/j;
	        System.out.println("Output is "+k);
	      }
	        
	    catch(ArithmeticException e){
	        System.out.println("Error is observed");
	    }
	    
	    finally{
	        System.out.println("Program is executed successfully");
	       
	    }
	}}
