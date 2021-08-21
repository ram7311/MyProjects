package com.online.hql;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.luv2code.hibernate.demo.entity.Shopping;
/*Criteria works for select operations only
time taken is bit higher then HQL
pagination concept is here*/
public class CriteriaDemo {
	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Shopping.class)
				.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();
		try {
			// start a transaction
			session.beginTransaction();

	// Restriction class  commonly used methods below
			//eq
			Criteria criteria1 = session.createCriteria(Shopping.class);
			criteria1.add(Restrictions.eq("product","Honey"));
			System.out.println("criteria1 :"+criteria1.uniqueResult());
			
			Criteria criteria2 = session.createCriteria(Shopping.class);
			criteria2.add(Restrictions.eq("product","Rice"));
			System.out.println("criteria2 :"+criteria2.uniqueResult());
			Shopping shp = (Shopping) criteria2.uniqueResult();
			System.out.println("Rice price"+shp.getPrice());
			
			//lt
			Criteria criteria3 = session.createCriteria(Shopping.class);
			criteria3.add(Restrictions.lt("id",5));
			System.out.println("criteria3 :"+criteria3.list());
			
			//gt
			Criteria criteria4 = session.createCriteria(Shopping.class);
			criteria4.add(Restrictions.gt("id",4));
			System.out.println("criteria4 :"+criteria4.list());
			
			//le
			Criteria criteria5 = session.createCriteria(Shopping.class);
			criteria5.add(Restrictions.le("id",3));
			System.out.println("criteria5 :"+criteria5.list());
			
			//ge
			Criteria criteria6 = session.createCriteria(Shopping.class);
			criteria6.add(Restrictions.ge("id",4));
			System.out.println("criteria6 :"+criteria6.list());
			
			//ne
			Criteria criteria7 = session.createCriteria(Shopping.class);
			criteria7.add(Restrictions.ne("id",2));
			System.out.println("criteria7 :"+criteria7.list());
			
			//ge
			Criteria criteria8 = session.createCriteria(Shopping.class);
			criteria8.add(Restrictions.between("id",2,4));
			System.out.println("criteria8 :"+criteria8.list());
			
			//ge
			Criteria criteria9 = session.createCriteria(Shopping.class);
			criteria9.add(Restrictions.like("product","%Rice%"));
			System.out.println("criteria9 :"+criteria9.list());
			
	//Order class commonly used methods are below
			
			Criteria criteria10 = session.createCriteria(Shopping.class);
			criteria10.addOrder(Order.asc("id"));
			System.out.println("criteria10 :"+criteria10.list());
			
			Criteria criteria11 = session.createCriteria(Shopping.class);
			criteria11.addOrder(Order.desc("id"));
			System.out.println("criteria11 :"+criteria11.list());
			
			Criteria criteria12 = session.createCriteria(Shopping.class);
			criteria12.setFirstResult(2);
			System.out.println("setFirstResult(2) :"+criteria12.list());//returns records after 2nd row
			
			Criteria criteria13 = session.createCriteria(Shopping.class);
			criteria13.setMaxResults(3);
			System.out.println("setMaxResults(3) :"+criteria13.list());//returns 2 records from top
			
			
			/*
			  Projection s an interface in Hibernate; it is coming from
			  org.hibernate.criterion package, from above we can retrive complete row but
			  by using projections we can retrieve single column
			 */
			
			Criteria criteria14 = session.createCriteria(Shopping.class);
			criteria14.setProjection(Projections.property("product"));
			System.out.println("Criteria14 Projection:"+criteria14.list());
			
			Criteria criteria15 = session.createCriteria(Shopping.class);
			Projection p1 = Projections.property("product");
			Projection p2 = Projections.property("price");
			ProjectionList pList = Projections.projectionList();
			pList.add(p1);
			pList.add(p2);
			criteria15.setProjection(pList);
			
			List l = criteria15.list();
			/*
			Iterator l2 =l.iterator();
			while(l2.hasNext())
			{
			  Object[] obj= (Object[])l2.next();
			  System.out.println(obj[0]);
			}
			*/
			System.out.printf("%-15s", "Product");
			System.out.printf("%-10s%n", "Price");
			for(Object l2:l) {
				
				Object[] obj = (Object[])l2;
				System.out.printf("%-15s", obj[0]);
				System.out.printf("%-10s%n", obj[1]);
			}
			
			System.out.printf("\u001B[1m I am bold");
			// commit transaction
			session.getTransaction().commit();
			System.out.println("\n======Done========");
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
