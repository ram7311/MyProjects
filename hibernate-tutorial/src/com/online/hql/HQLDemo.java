package com.online.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.luv2code.hibernate.demo.entity.Shopping;

public class HQLDemo {
	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Shopping.class)
				.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();
		try {
			// start a transaction
			session.beginTransaction();

			//select
			
			List<Shopping> shp = session.createQuery("from Shopping where id in(select id from Shopping)").list();
			if(shp!=null) {
			for(Shopping shp_temp:shp) {
				System.out.println("create query :"+shp_temp);
			}
			}
			
			List<Query> query1= session.createQuery("select id from Shopping").setFirstResult(2).list();
			System.out.println("setFirstResult(2) :"+query1);//returns records after 2nd row
			
			List<Query> query2= session.createQuery("select id from Shopping").setMaxResults(3).list();
			System.out.println("setMaxResults(3)"+query2);//returns 3 records from top
			
			//in multiple lines
			Query query3 = session.createQuery("select id from Shopping");
			query3 =	query3.setMaxResults(3);
			System.out.println(" in multiple lines"+query3.list());
			
			Query query4= session.createQuery("select product from Shopping where id=:i ");
			query4.setParameter("i", 2);
			List<Query> query5=query4.list();
			System.out.println("setParameter(1, 2)"+query5);
			  
			//aggregate functions with HQL
			
			List<Integer> max_id = session.createQuery("select max(id) from Shopping").list();
			System.out.println("max_id :"+max_id.get(0));//answer : 5
			
			
			// commit transaction
			session.getTransaction().commit();
			System.out.println("Done");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
