package com.learn.app;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.learn.model.StudentInfo;

public class LOBRetrievalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		FileOutputStream fos = null;
		FileWriter writer = null;

		
		config = new Configuration();
		config.configure();
		sessionFactory = config.buildSessionFactory();
		session = sessionFactory.openSession();
		
		StudentInfo studentInfo = session.get(StudentInfo.class, 1);
		
		
		try {
			fos = new FileOutputStream("codes.png");
			writer = new FileWriter("textFile.txt");
			fos.write(studentInfo.getImage());
			writer.write(studentInfo.getTextFile());
			
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		finally {
			
			try {
				fos.close();
				writer.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			session.close();
			sessionFactory.close();
		}


	}

}
