package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
public class EagerLazyDemo {

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
			int theId=1;
			//get instructor from DB
			Instructor tempInstructor = session.get(Instructor.class, theId);
			
			//Display instructor
			System.out.println("Instructor :"+tempInstructor);
			//Display courses
			System.out.println("Courses :"+tempInstructor.getCourses());
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
