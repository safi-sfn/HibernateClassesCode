package com.learn.app;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.learn.model.Courses;
import com.learn.model.Students;

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

		Courses c1 = new Courses();
		c1.setId(1);
		c1.setCourseName("Java Full-Stack");
		c1.setCoursePrice(3999);
		
		Courses c2 = new Courses();
		c2.setId(2);
		c2.setCourseName("Web Development");
		c2.setCoursePrice(2499);
		
		Courses c3 = new Courses();
		c3.setId(3);
		c3.setCourseName("DevOps");
		c3.setCoursePrice(999);
		
		Set<Courses> courseSet1 = new HashSet<>();
		courseSet1.add(c1);
		courseSet1.add(c2);
		courseSet1.add(c3);
		
		Set<Courses> courseSet2 = new HashSet<>();
		courseSet2.add(c1);
		courseSet2.add(c3);
		
		Students s1 = new Students();
		s1.setId(1);
		s1.setName("Arun");
		s1.setCity("Delhi");
		s1.setCourses(courseSet1);
		
		Students s2 = new Students();
		s2.setId(2);
		s2.setName("Vivek");
		s2.setCity("Patna");
		s2.setCourses(courseSet2);
		
		Students s3 = new Students();
		s3.setId(3);
		s3.setName("Karim");
		s3.setCity("Pune");
		s3.setCourses(courseSet1);
		
		
		
		try {
			transaction = session.beginTransaction();
			session.persist(s1);
			session.persist(s2);
			session.persist(s3);
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
