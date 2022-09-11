package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.entity.Instructor;
import com.luv2code.hibernate.entity.InstructorDetail;
import com.luv2code.hibernate.entity.Student;


public class CreateDeleteBiDemo {

	public static void main(String[] args) {
		// Create Session Factory object
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		// Create Session object
		Session session= factory.getCurrentSession();
		try {
			// use session object to save Student object in table
			System.out.println("Creating new objects");
			Instructor ins= new Instructor("Bhuvan","Baam","b@b.com");
			InstructorDetail insDetail= new InstructorDetail("BB ki vines","Acting");
			
			insDetail.setInstructor(ins);
			System.out.println("Newly created"+insDetail);
			// start a transaction
			 session.beginTransaction();
			
			//save student object
			System.out.println("Saving InstructorDetail");
			//session.save(insDetail);
			InstructorDetail insDetail1=session.get(InstructorDetail.class,4);
			System.out.println("To be deleted: "+insDetail1);
			session.delete(insDetail1);
			
			//commit the transaction
			session.getTransaction().commit();
			System.out.println("Instructor saved");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			factory.close();
		}
	}

}
