package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.entity.Student;


public class CreateStudentDemo {

	public static void main(String[] args) {
		// Create Session Factory object
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student.class).buildSessionFactory();
		// Create Session object
		Session session= factory.getCurrentSession();
		try {
			// use session object to save Student object in table
			System.out.println("Creating new Student object");
			
			//create  student class
			Student s= new Student("Mukul","Pandit","m@p.com");
			
			// start a transaction
			 session.beginTransaction();
			
			//save student object
			System.out.println("Saving Student");
			session.save(s);
			
			//commit the transaction
			session.getTransaction().commit();
			System.out.println("Student saved");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			factory.close();
		}
	}

}
