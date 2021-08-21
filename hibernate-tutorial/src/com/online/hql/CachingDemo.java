package com.online.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Shopping;

public class CachingDemo {
	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Shopping.class)
				.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();
		Session session2 = factory.openSession();
		try {
			// start a transaction
			session.beginTransaction();

			/*
			First Level Cache --internally it was there in session
			Session object holds the first level cache data. It is enabled by default. 
			The first level cache data will not be available to entire application. An application can use many session object.
			*/
			/* for second level cache check in hibernate-tutorial-mvn project*/
			
			Shopping shp = session.get(Shopping.class,2);//in console select query execute here
			
			System.out.println("1st call :"+shp.getProduct());
			
			Shopping shp2 = session.get(Shopping.class,2);//in console select query don't execute here because it was already in session cache
														  //it's pick from there
			
			System.out.println("2nd call :"+shp2.getProduct());
			
			// commit transaction
			session.getTransaction().commit();
			
			
			session2.beginTransaction();
			System.out.println("Second session started");
			Shopping shp3 = session2.get(Shopping.class,2);
			System.out.println("2nd session call :"+shp3.getProduct());
			
			
			
			
			// commit transaction
			session2.getTransaction().commit();
			
			
			System.out.println("Done");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
