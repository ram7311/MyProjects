package com.pract;


	
public class Temp{

	public static void main(String[] args)  {
	
		try {	
    throw new MyException("Customised Exception");
		
	}
	catch(Exception e){
		System.out.println(e.getMessage());
	}
	}}
	