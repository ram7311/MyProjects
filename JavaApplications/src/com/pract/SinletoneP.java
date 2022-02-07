package com.pract;





public class SinletoneP {

	public static void main(String[] args) {
          Abc obj1=Abc.getInstance();
          Abc obj2=Abc.getInstance();
          System.out.println(obj1+" -----"+obj2);//same
	}	
}

class Abc{
	private static Abc obj=new Abc();
	 private Abc() {
		 System.out.println("inside the constructor");
	 }
		public static Abc getInstance()
		{ 
			return obj;
		}

}

