package com.school.app;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.school.model.Students;



public class LaunchUpdate {

	public static void main(String[] args) {
		
//		Configuration config = new Configuration();
//		config.configure();
//		config.addAnnotedClass(Students.class);
//		SessionFactory sessionFactory = config.buildSessionFactory();
		
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Students.class).buildSessionFactory();
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		
		try {
			
			 session = sessionFactory.openSession();
			 transaction = session.beginTransaction();
			 Students st = new Students();
			 st.setStudent_id(1003);
			 st.setFirst_name("Sameer");
			 st.setLast_name("Kukain");
			 st.setPhone("8880007771");
			 st.setAddress("Ahmadabad");
			 st.setEmail("sameer@gmail.com");
			 st.setGender("Male");
			 
//			 session.persist(st);
//			 session.saveOrUpdate(st);
//			 session.merge(st);
			 
//			 session.delete(st);
			 session.remove(st);
			 
			 flag = true;
			 
		}
		catch(HibernateException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if(flag==true) {
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
