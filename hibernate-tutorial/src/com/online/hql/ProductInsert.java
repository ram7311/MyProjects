package com.online.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Shopping;
import com.luv2code.hibernate.demo.entity.Student;

public class ProductInsert {
	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Shopping.class)
				.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();
		try {
			// start a transaction
			session.beginTransaction();

			  Shopping shp1 = new Shopping("Rice","1010"); 
			  Shopping shp2 = new Shopping("Chapathi","38"); 
			  Shopping shp3 = new Shopping("Honey","450");
			  Shopping shp4 = new Shopping("Dhal","200");

			  int shp1_result = (int) session.save(shp1);
			  int shp2_result = (int) session.save(shp2);
			  int shp3_result = (int) session.save(shp3);
			  int shp4_result = (int) session.save(shp4);
			  
				if (shp1_result > 0) {

					System.out.println("shopping product Rice added :\n" + shp1);
				}
				if (shp2_result > 0) {

					System.out.println("shopping product Chapathi added :\n" + shp2);
				}
				if (shp3_result > 0) {

					System.out.println("shopping product Honey added :\n" + shp3);
				}
				if (shp4_result > 0) {

					System.out.println("shopping product Dhal added :\n" + shp4);
				}
			
			
			// commit transaction
			session.getTransaction().commit();
			System.out.println("Done");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
