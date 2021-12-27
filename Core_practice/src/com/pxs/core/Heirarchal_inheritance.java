package com.pxs.core;


class Engine{
	
	public void work() {
		System.out.println("in Engine");
	}
}

class Tata extends Engine{
	
	public void speed() {
		System.out.println("in TATA");
	}
}

class Bmw extends Engine{
	
	public void power() {
		System.out.println("in BMW");
	}
}

public class Heirarchal_inheritance {
	
	public static void main(String[] args) {

		Bmw p = new Bmw();
		p.power();
		p.work();
		
		Tata t = new Tata();
		t.speed();
		t.work();
	}

}
