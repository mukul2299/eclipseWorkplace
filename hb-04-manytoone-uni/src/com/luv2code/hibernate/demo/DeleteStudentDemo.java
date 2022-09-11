package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.entity.Student;


public class DeleteStudentDemo {

	public static void main(String[] args) {
		// Create Session Factory object
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student.class).buildSessionFactory();
		// Create Session object
		Session session= factory.getCurrentSession();
		try {			
			
			session= factory.getCurrentSession();
			session.beginTransaction();
			
			//Method 1 for deleting 
			Student toBeDeleted= session.get(Student.class,8);
			System.out.println("Deleting via session.delete()");
			session.delete(toBeDeleted);
			//Deleting student
			System.out.println("Deleting via createQuery().executeUpdate()");
			session.createQuery("delete from Student where firstName='Mukul'" )
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





