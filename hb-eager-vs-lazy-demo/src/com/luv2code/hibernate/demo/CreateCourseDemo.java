package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.entity.Course;
import com.luv2code.hibernate.entity.Instructor;
import com.luv2code.hibernate.entity.InstructorDetail;
import com.luv2code.hibernate.entity.Student;


public class CreateCourseDemo {

	public static void main(String[] args) {
		// Create Session Factory object
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();
		// Create Session object
		Session session= factory.getCurrentSession();
		try {
			// use session object to save Student object in table
			
			// start a transaction
			 session.beginTransaction();
			 
			// Get the instructor from DB
			 Instructor ins= session.get(Instructor.class, 1);
			 
			// create some courses
			 Course c1= new Course("Fishing");
			 Course c2= new Course("Gardening");
			 ins.addCourse(c1);
			 ins.addCourse(c2);
			 
			 session.save(c1);
			 session.save(c2);
			
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
