package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.entity.Course;
import com.luv2code.hibernate.entity.Instructor;
import com.luv2code.hibernate.entity.InstructorDetail;
import com.luv2code.hibernate.entity.Student;


public class EagerLazyDemo {

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
			
//			Instructor instructor= new Instructor("Haseena","Parker","haseena@parker.com");
//			InstructorDetail instructorDetail= new InstructorDetail("www.youtube.com.haseena","Lootpaat");
//			Course course= new Course("Shadi Karna");
//			instructor.setInstructorDetail(instructorDetail);
//			instructor.addCourse(course);
			session.beginTransaction();
//			
//			session.save(instructor);
//			session.save(course);
//			
//			course= new Course("Property apne nam karana");
//			instructor.addCourse(course);
//			session.save(course);
//			
//			course= new Course("Raato raat gayab ho jaana");
//			instructor.addCourse(course);
//			session.save(course);
			
			Instructor temp=session.get(Instructor.class, 6);
			System.out.println("luv2code: Instructor - "+temp);
			System.out.println("luv2code: Course - "+temp.getCourses());
			session.getTransaction().commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			factory.close();
			session.close();
		}
	}

}
