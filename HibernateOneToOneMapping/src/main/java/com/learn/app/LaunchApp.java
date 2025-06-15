package com.learn.app;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.learn.model.Answer;
import com.learn.model.Question;

public class LaunchApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		
		boolean flag = false;
		
		config = new Configuration();
		config.configure();
		sessionFactory = config.buildSessionFactory();
		session = sessionFactory.openSession();
		
		Question que1 = new Question();
		que1.setId(1);
		que1.setQuestion("What is Hibernate");
		
		Answer ans1 = new Answer();
		ans1.setId(1);
		ans1.setAnswer("Hibernate is an ORM Framework");
		
		que1.setAnswer(ans1);
		
		Question que2 = new Question();
		que2.setId(2);
		que2.setQuestion("What is JPA");
		
		Answer ans2 = new Answer();
		ans2.setId(2);
		ans2.setAnswer("It is a Specification used to persist "
				+ "data between java object and relational database");
		
		que2.setAnswer(ans2);
		
		Question qa = session.get(Question.class, 1);
		System.out.println(qa);
		
		
		try {
			
//			transaction = session.beginTransaction();
//			session.persist(que1);
//			session.persist(que2);
//			flag = true;
			
		} 
		catch (HibernateException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
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
