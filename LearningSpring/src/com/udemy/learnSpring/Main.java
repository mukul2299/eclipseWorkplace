package com.udemy.learnSpring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.udemy.learnSpring.a1.Coach;
import com.udemy.learnSpring.a1.GymCoach;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
//		@Qualifier("runningCoach")
		GymCoach coach= (GymCoach)context.getBean("coach",Coach.class);
		
		coach.introduce();
		System.out.println(coach.giveTasks());
		coach.motivate();
		
		((AbstractApplicationContext) context).close();
	}

}
