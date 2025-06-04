package com.sfn.app;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sfn.model.Employee;



public class LaunchSelectiveApp {

	public static void main(String[] args) {
		
			SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Employee.class).buildSessionFactory();
			Session session = null;
			Transaction transaction = null;
			boolean flag = false;
			
			try {
				session = sessionFactory.openSession();
				transaction = session.beginTransaction();
				
				Employee emp = new Employee();
				emp.seteId(1);
				emp.seteName("Saourav");
				emp.seteCity("Hydrabad");
				emp.seteSallry(45000);
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
