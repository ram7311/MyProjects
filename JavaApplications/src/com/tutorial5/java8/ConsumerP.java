package com.tutorial5.java8;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


// Consumer is used to just to print the student information
class Studentp{
	String name;
	int marks;
	
	Studentp(String name, int marks){
		this.name= name;
		this.marks=marks;
	}
}

public class ConsumerP {
    public static void main(String[] args) {
	
    Function<Student,String> f= s-> {
    	                               int marks= s.marks;
    	                               String grade="";
    	                               if(marks>=80)     grade="A";
    	                          else if(marks>=70)     grade ="B";
    	                          else if(marks>=60)     grade ="C";  
    	                          else if(marks>=50)     grade ="D";
    	                          else                   grade ="Failed";
									return grade;
    	                               };
    	    Predicate<Student> p= s->s.marks>=60;                             
    	   Consumer<Student> c= s1->
    	   {
    		  System.out.println("Student name: "+s1.name);
    		  System.out.println("Student marks: "+s1.marks);
    		  System.out.println("Student grade: " +f.apply(s1));
    		  System.out.println();
    	   };
  Student[] s= { new  Student("Sukanya",90),	
		         new  Student("Sunny",70),	
		         new  Student("Bunny",50),	
		         new  Student("Chinny",30),	
		         new  Student("Funny",20),	
                };
  
  for(Student s1:s) {
	  if(p.test(s1)) {
	c.accept(s1);
  
  }
  }
}}
