package com.learner.app;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.learner.model.StudentInfo;

public class LaunchStApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;

		config = new Configuration();
		config.configure();
		config.addAnnotatedClass(StudentInfo.class);
		sessionFactory = config.buildSessionFactory();
		session = sessionFactory.openSession();
		
		StudentInfo stInfo = new StudentInfo();
//		stInfo.setsId(1);
		stInfo.setsName("Kapur");
		stInfo.setsCity("Bhopal");
		stInfo.setsGender("Male");
		
		
		try {
			transaction = session.beginTransaction();
			session.persist(stInfo);
			
			flag=true;
			
		}
		catch(HibernateException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally{
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
