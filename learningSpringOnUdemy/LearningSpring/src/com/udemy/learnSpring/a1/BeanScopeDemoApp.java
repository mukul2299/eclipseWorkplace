package com.udemy.learnSpring.a1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext
				("bean-scope-applicationContext.xml");
		CricketCoach coach= (CricketCoach) context.getBean("cricketCoach",CricketCoach.class);
		coach.introduce();
		System.out.println("First Bean : "+coach.getTeam());
		coach.setTeam("Rajasthan Royanls");
		System.out.println("First Bean : "+coach.getTeam());
		
		CricketCoach coach1= (CricketCoach) context.getBean("cricketCoach",CricketCoach.class);
		coach1.introduce();
		System.out.println("Second Bean : "+coach1.getTeam());
		coach.setTeam("CSK");
		System.out.println("Second Bean : "+coach1.getTeam());
		System.out.println("First Bean : "+coach.getTeam());
		System.out.println(coach.equals(coach1));
	}

}
