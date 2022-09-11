package com.udemy.learnSpring.a1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext
				("bean-scope-applicationContext.xml");
		CricketCoach coach=context.getBean("cricketCoach",CricketCoach.class);
		coach.introduce();
		context.close();
	}
	

}
