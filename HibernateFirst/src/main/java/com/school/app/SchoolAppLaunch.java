package com.school.app;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.school.model.Courses;
import com.school.model.Parents;
import com.school.model.Students;
import com.school.model.Teachers;

public class SchoolAppLaunch {

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
		session=sessionFactory.openSession();
		
		Teachers teacher = new Teachers();
		teacher.setTeacher_id(103);
		teacher.setFirst_name("Saurav");
		teacher.setLast_name("raj");
		teacher.setEmail("rajsaurav21@gmail.com");
		teacher.setPhone("9749865390");
		teacher.setSpecilization("Hindi");
	
		
		Students students = new Students();
		students.setStudent_id(1003);
		students.setAddress("saipur, Hydrabad");
		students.setFirst_name("Rohan");
		students.setLast_name("kumar");
		students.setEmail("rohan@gmail.com");
		students.setPhone("8934389290");
		students.setGender("Male");
		
		
		Courses course = new Courses();
		course.setCourse_id(156);
		course.setCourse_name("Hindi Language");
		course.setCourse_code("Hindi-103");
		
		Parents parent = new Parents();
		parent.setStudent_id(101);
		parent.setParent_id(1001);
		parent.setFirst_name("Shohail");
		parent.setLast_name("Khan");
		parent.setEmail("shohail@gmail.com");
		parent.setPhone("6723910730");
		parent.setRealtionship("Guardian");
		
		
		try {
			transaction = session.beginTransaction();
			session.persist(course);
		    session.persist(students);
		    session.persist(teacher);
		    session.persist(parent);
		    flag=true;
		    
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
