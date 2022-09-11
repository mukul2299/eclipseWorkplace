package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.entity.Course;
import com.luv2code.hibernate.entity.Instructor;
import com.luv2code.hibernate.entity.InstructorDetail;
import com.luv2code.hibernate.entity.Student;


public class CreateDeleteRetreivCourseDemo {

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
//			Instructor instructor= new Instructor("Jagga","Daaku","Jagga@Daaku.com");
//			InstructorDetail instructorDetail= new InstructorDetail("www.youtube.com.jaggaJasoos","Killing");
//			Course course= new Course("Killing people");
//			instructor.setInstructorDetail(instructorDetail);
//			instructor.addCourse(course);
			session.beginTransaction();
//			session.save(instructor);
//			session.save(course);
			session.delete(session.get(InstructorDetail.class, 3));
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
