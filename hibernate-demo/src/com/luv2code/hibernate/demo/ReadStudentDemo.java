package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.entity.Student;


public class ReadStudentDemo {

	public static void main(String[] args) {
		// Create Session Factory object
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student.class).buildSessionFactory();
		// Create Session object
		Session session= factory.getCurrentSession();
		try {
			System.out.println("New Student created");
			Student s= new Student("Rahul","Verma","r@v.com");
			// start a transaction
			session.beginTransaction();
			
			//save student object
			 
			int savedStudentId=  (int) session.save(s);
		    System.out.println("Student saved \n \n Getting Student");
			Student retreivedStudent= session.get(Student.class, savedStudentId);
			
			//commit the transaction
			session.getTransaction().commit();
			
			System.out.println("Got the Student"+retreivedStudent.toString());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			factory.close();
		}
	}

}
