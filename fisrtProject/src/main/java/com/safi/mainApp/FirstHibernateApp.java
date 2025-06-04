package com.safi.mainApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.safi.model.Branch;
//import com.safi.model.Student;

public class FirstHibernateApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// step1 -> Create the Configuration object
		Configuration config = new Configuration();
		
		// step2 -> Configure hibernate.cfg.xml file to the Configuration object
		// NOTE:- whenever we give any name other than "hibernate.cfg.xml" .we have to specify in configure() like: hib.conf.xml --> config.configure("hib.conf.xml")
		config.configure();
		
		// step3 -> Create SessionFactory object
		SessionFactory sessionFactory=config.buildSessionFactory();
		
		//step4 -> get session object from sessionFactory
		Session session = sessionFactory.openSession();
		
		// step5 -> insert,update,delete we have to use transaction
		Transaction transaction = session.beginTransaction();
		
//		Student student = new Student();
//		student.setSid(18);
//		student.setSname("Rohit");
//		student.setScity("Hydrabad");
//		student.setPhone("7834561290");
		
		Branch branch = new Branch();
		branch.setBranch_id(146);
		branch.setBranch_name("Computer Science");
		branch.setBranch_capcity(150);
		
		// step6 -> performing operation
		session.save(branch);
		
		// Step7 -> performing transaction operation
		transaction.commit();
		
		//step8 -> session close
		session.close();
	}

}










