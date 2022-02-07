package com.tutorial;
//By default inside interface every method is Abstract means doesn't have implementation details. 
//But if we wanted then need to use default modifier.

interface In1
{
    final int a = 10;
    default void display()
    {
        System.out.println("hello");
    }
    static void displayy()
    {
        System.out.println("helloHelloo");
    }
    
}
  
// A class that implements the interface.
public class InterfacewithDefault  implements In1
{
	 public void displaay()
	    {
	        System.out.println("HHii");
	    }
    public static void main (String[] args)
    {
    	InterfacewithDefault t = new InterfacewithDefault();
        t.display();
        In1.displayy();
    }
}

















