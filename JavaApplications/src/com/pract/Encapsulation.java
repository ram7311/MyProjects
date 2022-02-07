package com.pract;



class Student{
	int rollno;
	String name;
	
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}




public class Encapsulation {

	public static void main(String[] args) {
		Student st=new Student();
		
st.setRollno(101);
st.setName("Sukanya");
		System.out.println(st.getRollno());
		System.out.println(st.getName());

	}

}
