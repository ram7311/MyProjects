package com.tutorial;
//functional interface
interface Drawable{  
    public void draw();  
}  

public class FunctionalP{  
    public static void main(String[] args) {  
    	int width=10;
    	
//    	Drawable p=new Drawable() {              //using functional interface
//    			public void draw() {
//    		System.out.println("inside the draw method: "+width);
//    	}    			
//    	};
    	
    	Drawable p= ()->{
    		System.out.println("inside the draw method: " +width);  //using Lamda expression
    	};    	
    	p.draw();
    }}
