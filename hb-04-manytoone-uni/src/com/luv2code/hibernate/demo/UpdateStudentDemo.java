





package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.entity.Student;


public class UpdateStudentDemo {

	public static void main(String[] args) {
		// Create Session Factory object
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student.class).buildSessionFactory();
		// Create Session object
		Session session= factory.getCurrentSession();
		try {
			session.beginTransaction();
			
			//save student object
			 
			int savedStudentId=  3;
		    System.out.println("Student saved \n \n Getting Student");
			Student retreivedStudent= session.get(Student.class, savedStudentId);
			
			//commit the transaction
			retreivedStudent.setFirstName("Raju");
			session.getTransaction().commit();
			
			//NEW CODE
			session= factory.getCurrentSession();
			session.beginTransaction();
			
			//Updating mail ids
			System.out.println("Updating mail ids");
			session.createQuery("update Student set email='rah@ver' where firstName='Rahul'" )
			.executeUpdate();
			session.getTransaction().commit();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			factory.close();
		}
	}

}

