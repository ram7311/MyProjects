package com.online.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.luv2code.hibernate.demo.entity.Shopping;

public class NamedQueries {
	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Shopping.class)
				.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();
		try {
			// start a transaction
			session.beginTransaction();

			  Query query1 = session.getNamedQuery("findProductPriceByName");
			  query1.setParameter("name", "Rice");
			 System.out.println("query1 :"+query1.list().get(0));
			
			 Query query2 = session.getNamedQuery("findProductByid");
			 query2.setParameter("id", 3);
			 System.out.println("query2 :"+query2.list().get(0));
			
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			// commit transaction
			session.getTransaction().commit();
			System.out.println("Done");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
