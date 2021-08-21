package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
public class CreateDemo {

	public static void main(String[] args) {

		//create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		//create session
		Session session =factory.getCurrentSession();
		try {
			
			//create the objects
			
			Instructor tempInstructor = new Instructor("nanda","roy","nandaroy@tcs.com");
			
			InstructorDetail tempInstructorDetail = new InstructorDetail("https://www.nandaroy.com/youtube","hero");
			//associate the objects
			
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			//start a transaction
			session.beginTransaction();
			
			//save the instructor
			//Note : this will also save the details object because of cascadeType.ALL
			System.out.println("saving instructor :"+tempInstructor);
			session.save(tempInstructor);
			//commit transaction
			session.getTransaction().commit();
			System.out.println("Done");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
