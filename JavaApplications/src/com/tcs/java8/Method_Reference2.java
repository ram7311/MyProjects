package com.tcs.java8;

interface Interf2{
	public void display(String name);
}
class Sample{
	public Sample(String name) {
		System.out.println("Construction execution with argument->"+name);
	}
}
interface Interf3{
	public void details(int id, String name, int age, String course);
}
class Student{
	int id;
	String name;
	int age;
	String course;
	public Student(int id, String name,	int age, String course) {
		System.out.println(id+" "+name+" "+age+" "+course+" ");
		this.id=id;
		this.name=name;
		this.age=age;
		this.course=course;
	}
}
public class Method_Reference2 {
	
	public static void main(String[] args) {
		Method_Reference2 obj = new Method_Reference2();
		
		Interf2 i = obj :: m;
		i.display("ram");
		
		Interf2 i2 = Sample :: new;//constructor reference
		i2.display("sam");
		//why this constructor reference what is the use of it ?
		Interf3 i3 = ( id, name, age, course)->new Student(id, name, age, course);//lamda way implementation ...its big 
		Interf3 i4 = Student::new;//reduced code...its small
		i4.details(1, "ram", 26,"Java" );
	}
	
	public void m(String name) {
		System.out.println("This is m method with argument -> "+name);
	}
}
