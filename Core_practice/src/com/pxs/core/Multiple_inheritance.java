package com.pxs.core;

//Normal--> methods and variables 
//Functional --> single abstract method
//Marker --> empty
interface Sport{
	
	 default void cricket() {
		System.out.println("Cricket interface");
	}
}
class Game{
	
public void carroms() {
	System.out.println("Game class Carroms");
}
	
}

public class Multiple_inheritance extends Game implements Sport{

	public static void main(String[] args) {
		
		Multiple_inheritance m = new Multiple_inheritance();
		m.carroms();
		m.cricket();

	}

}
