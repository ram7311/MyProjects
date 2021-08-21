package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
public class DeleteCourseDemo {

	public static void main(String[] args) {

		//create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();
		//create session
		Session session =factory.getCurrentSession();
		try {
			//start a transaction
			session.beginTransaction();
			int theId=10;
			Course course = session.get(Course.class, theId);
			System.out.println("Deleting Course :"+course);
			session.delete(course);
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("Done");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
			factory.close();
		}
		
	}

}
