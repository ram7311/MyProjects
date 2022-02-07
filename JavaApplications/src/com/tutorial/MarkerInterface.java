package com.tutorial;
//Marker interface --> jvm gives info to the compiler to finish the task
//By implementing Cloneable interface
//we make sure that instances of class A
//can be cloned.
//To reduce the complexity burden we are using Marker interface.
//can we create the marker interface--Yes but it should be customised Compiler and JVM


class C implements Cloneable{      // to inform JMV that copying the object
	int a;
	String s;
	public C(int a, String s) {
		this.a=a;
		this.s=s;
		 System.out.println(" The value is: "+a+ "  The name is:"+s);
	}
	// Overriding clone() method by simply calling Object class clone() method.

	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();  //clone()method is present in "object" class having it's own implementation
		                      //clone() we are getting from the JVM
	}
}
public class MarkerInterface {
	public static void main(String[] args) throws CloneNotSupportedException  {
		C obj=new C(4,"Sukanya");
       C obj1=(C)obj.clone();  //Type casting //creating copy of object a  and passing it to b
          System.out.println(obj1.a);        //(C) is used for ExplicittypeCasting 
          System.out.println(obj1.s);        //cloning 'a' and holding
		                                    // new cloned object reference in b
	}

}
