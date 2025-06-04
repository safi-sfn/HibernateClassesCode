package com.school.app;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.school.model.Students;

public class LaunchStandardApp {
	public static void main(String[] args) {
		
		Configuration config = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		
		config = new Configuration();
		config.configure();
		sessionFactory = config.buildSessionFactory();
		session = sessionFactory.openSession();
		
		Students student = new Students();
		student.setStudent_id(7);
		student.setFirst_name("Aman");
		student.setLast_name("khan");
		student.setGender("Male");
		student.setAddress("Bakerpur , Munger");
		student.setEmail("aman@gmail.com");
		student.setPhone("8967246745");
		
		
		try {
			transaction = session.beginTransaction();
			session.persist(student);
			flag = true;
			
		} 
		catch (HibernateException e) {
			
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			if(flag == true) {
				transaction.commit();
			}
			else {
				transaction.rollback();
			}
			session.close();
			sessionFactory.close();
		}
	}

}
