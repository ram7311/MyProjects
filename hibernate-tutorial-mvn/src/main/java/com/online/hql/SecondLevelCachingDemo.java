package com.online.hql;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.luv2code.hibernate.demo.entity.Shopping;

public class SecondLevelCachingDemo {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

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
			
			Shopping shp = session.get(Shopping.class,2);//in console select query execute here
			
			System.out.println("1st call :"+shp.getProduct());
			
			Shopping shp2 = session.get(Shopping.class,2);//in console select query don't execute here because it was already in session cache
														  //it's pick from there
			
			System.out.println("2nd call :"+shp2.getProduct());
			
			// commit transaction
			session.getTransaction().commit();
			
			
			session2.beginTransaction();
			
			Shopping shp3 = session2.get(Shopping.class,2);
			System.out.println("2nd session call :"+shp3.getProduct());
			
		
			
			
			
			// commit transaction
			session2.getTransaction().commit();
			
			Session session3 = factory.openSession();
			// start a transaction
			session3.beginTransaction();
			
		List<Shopping> shp4 =   session3.createCriteria(Shopping.class).list();

		Createexcel ss = new Createexcel();
		ss.export(shp4);
			// commit transaction
			session3.getTransaction().commit();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
}
