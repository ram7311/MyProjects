package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.luv2code.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();
		try {
			// start a transaction
			session.beginTransaction();

			// select query
			  List<Student> tempStudent=session.createQuery("from Student where firstName='bonita'").list(); 
			  //display the student 
			  for(Student t:tempStudent) { 
				  System.out.println("yes"+t);
			  
			  }
			  //update query
			  session.createQuery("update Student set lastName='parota' where id=3").executeUpdate();
			  System.out.println("Updated bonita last name as parota");
			  //delete query
			  session.createQuery("delete from Student where id=4").executeUpdate();
			  System.out.println("Deleted where id=4");
			  
			 
			// commit transaction
			session.getTransaction().commit();
			System.out.println("Done");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
