package com.retrieval.app;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.retrieval.model.Parents;
import com.retrieval.model.Students;

public class GetRecordApp {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure()
				.addAnnotatedClass(Students.class)
				.addAnnotatedClass(Parents.class).buildSessionFactory();
		Session session = null;
		
		try {
			session = sessionFactory.openSession();
			Students student = session.get(Students.class, 1001);
			Parents parent = session.get(Parents.class, 1001);
			System.out.println(student);
			System.out.println(parent);
			
		}catch (HibernateException e) { 
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
			sessionFactory.close();
		}

	}

}
