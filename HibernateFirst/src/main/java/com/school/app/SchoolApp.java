package com.school.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.school.model.Courses;
import com.school.model.Students;
import com.school.model.Teachers;

public class SchoolApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config = new Configuration();
		
		config.configure();
		
		SessionFactory sessionFactory=config.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Teachers teacher = new Teachers();
		teacher.setTeacher_id(101);
		teacher.setFirst_name("Pawan");
		teacher.setLast_name("singh");
		teacher.setEmail("pawan12@gmail.com");
		teacher.setPhone("6549872356");
		teacher.setSpecilization("Math");
		session.save(teacher);
		
		Students students = new Students();
		students.setStudent_id(1001);
		students.setAddress("Kubernagar, Hydrabad");
		students.setEmail("sameer26@gmail.com");
		students.setFirst_name("sameer");
		students.setLast_name("alam");
		students.setPhone("6894562907");
		students.setGender("Male");
			session.save(students);
		
		Courses course = new Courses();
		course.setCourse_id(123);
		course.setCourse_name("Trigonemetry");
		course.setCourse_code("Math-101");
		session.save(course);
		
		
		transaction.commit();
		
		session.close();
		
		
	}

}
