package com.safi.app;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.safi.model.Employee;

public class LaunchApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

//		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Employee.class).buildSessionFactory();
		Configuration config = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		
		config = new Configuration();
		config.addAnnotatedClass(Employee.class);
		sessionFactory = config.buildSessionFactory();
		session = sessionFactory.openSession();
		
		Employee emp = new Employee();
		emp.seteId(2);
		emp.seteName("Tom");
		emp.seteCity("London");
		emp.seteSallary(40000);
		
		try {
			transaction = session.beginTransaction();
						
			session.persist(emp);
			flag = true;
		}
		catch(HibernateException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
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
