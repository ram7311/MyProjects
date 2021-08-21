package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Student;
public class CreateCoursesAndStudentsDemo {

	public static void main(String[] args) {

		//create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		//create session
		Session session =factory.getCurrentSession();
		try {
			//start a transaction
			session.beginTransaction();
			
			//create some courses
			Course corse1 = new Course("Air Guitar - The Ultimate Guide");
			
			System.out.println("\nSaving courses......");
			//save courses
			session.save(corse1);
			System.out.println("\nSaving courses......");
			Student student1 = new Student("john","Deo","johnDeo@gmail.com");
			Student student2 = new Student("sam","sun","sansun@gmail.com");
			corse1.addStudent(student1);
			corse1.addStudent(student2);
			
			System.out.println("\nSaving students...."+corse1.getStudents());
			
			session.save(student1);
			session.save(student2);
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
