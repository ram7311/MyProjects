package com.tutorial1.ExceptionHandling;

public class Exception1 {

	public static void main(String[] args) {
		try{
			int a[]= new int[5];
			    a[6]= 30/0;
		}
		//catch(Exception e){ // Exception Heirarchy must be followed
	    	   //System.out.println("It's Exception");
	    	       //  }
       catch(ArithmeticException e){
    	   System.out.println("It's Arithmetic Exception");
    	         }
	  catch(ArrayIndexOutOfBoundsException e){
	    	   System.out.println("It's Array Index OutOf bound Exception");
	    	         }
		catch(Exception e){
	    	   System.out.println("It's Exception");
	    	         }
	}

}
