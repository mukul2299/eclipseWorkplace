package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create Session Factory object
			SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").
					addAnnotatedClass(Student.class).buildSessionFactory();
			// Create Session object
			Session session= factory.getCurrentSession();
			try {
				// use session object to save Student object in table
				System.out.println("Creating new Student object");
				
				//create 3 student class
				Student s1= new Student("Mukul","Pandit","m@p.com");
				Student s2= new Student("Rakesh","Jha","r@j.com");
				Student s3= new Student("Murmur","Wakas","m@w.com");
				
				// start a transaction
				 session.beginTransaction();
				
				//save student object
				System.out.println("Saving Student");
				session.save(s1);
				session.save(s2);
				session.save(s3);
				
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
