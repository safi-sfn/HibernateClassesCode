package com.learn.app;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.learn.model.AnswerTable;
import com.learn.model.QuestionTable;

public class LaunchMainApp {

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
		
		QuestionTable q1 = new QuestionTable();
		q1.setId(1);
		q1.setQuestion("Which interface is the main entry point for Hibernate operations?");
		
		AnswerTable ans1 = new AnswerTable();
		ans1.setId(1);
		ans1.setAnswer("Session");
		ans1.setQuestion(q1);
		
		AnswerTable ans2 = new AnswerTable();
		ans2.setId(2);
		ans2.setAnswer("SessionFactory");
		ans2.setQuestion(q1);
		
		AnswerTable ans3 = new AnswerTable();
		ans3.setId(3);
		ans3.setAnswer("Transaction");
		ans3.setQuestion(q1);
		
		AnswerTable ans4 = new AnswerTable();
		ans4.setId(4);
		ans4.setAnswer("Query");
		ans4.setQuestion(q1);
		
		List<AnswerTable> answers = new ArrayList<AnswerTable>();
		answers.add(ans1);
		answers.add(ans2);
		answers.add(ans3);
		answers.add(ans4);
		
		q1.setAnswerList(answers);
		
		try {
			transaction = session.beginTransaction();
			session.persist(q1);
			flag=true;
		}
		catch(HibernateException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			if(flag==true) 
				transaction.commit();
			else
				transaction.rollback();
			
			session.close();
			sessionFactory.close();
		}

	}

}
