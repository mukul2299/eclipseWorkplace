package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.entity.Student;


public class QueryStudentDemo {

	public static void main(String[] args) {
		// Create Session Factory object
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student.class).buildSessionFactory();
		// Create Session object
		Session session= factory.getCurrentSession();
		try {
			
			// start a transaction
			 session.beginTransaction();
			
			List<Student> students= session.createQuery("from Student").list();
			System.out.println("\nAll Students");
			displayStudents(students);
			
			List<Student> uniqueStudents= session.createQuery("from Student s where s.lastName='Pandit'")
					.list();
			System.out.println("\nAll Students having pandit as last name");
			displayStudents(uniqueStudents);
			
			uniqueStudents= session.createQuery("from Student s where s.lastName='Pandit'"+
			" OR s.lastName='Verma'").list();
			System.out.println("\nAll Students having pandit or verma as last name");
			displayStudents(uniqueStudents);
			
			uniqueStudents= session.createQuery("from Student where email Like '%@p%'").list();
			System.out.println("\nAll Students having @p in emails");
			displayStudents(uniqueStudents);
			
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

	public static void displayStudents(List<Student> students) {
		students.forEach(s->System.out.println(s));
	}

}
