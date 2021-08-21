package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {

		//create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		//create session
		Session session =factory.getCurrentSession();
		try {
			
			//create a student object
			System.out.println("Creating a new student object");
			Student tempStudent = new Student("Read","now","read@yahoo.com");
			
			//start a transaction
			session.beginTransaction();
			
			//save the student object
			System.out.println("saving the student");
			System.out.println(tempStudent);
			session.save(tempStudent);
			
			//commit transaction
			session.getTransaction().commit();
			
			//my new code for read data 
			//find out the student Id: Primary Key
			System.out.println("Saved student generated Id: "+tempStudent.getId());
			
			//now get a new session and start transaction
			session =factory.getCurrentSession();
			session.beginTransaction();
			//retrive student based on the id: primary key
			System.out.println("\nGetting student with id:"+tempStudent.getId());
			
			Student myStudent=session.get(Student.class, tempStudent.getId());//getId() it should be primary key for best practice or u can use anything like email or name
			
			System.out.println("Get complete :"+myStudent);
			//commit the transaction
			session.getTransaction().commit();
			
			System.out.println("Done");
		}
		catch(Exception e) {}
		
	}

}
