package com.luv2code.springboot.util;

public class User {

	private String abcd;
	private String bed;

	public User() {
	}

	public User(String a, String b) {
		super();
		this.abcd = a;
		this.bed = b;
	}

	public String getA() {
		return abcd;
	}

	public void setA(String a) {
		this.abcd = a;
	}

	public String getB() {
		return bed;
	}

	public void setB(String b) {
		this.bed = b;
	}

}
