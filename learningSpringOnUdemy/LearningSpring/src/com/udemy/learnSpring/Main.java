package com.udemy.learnSpring;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.udemy.learnSpring.a1.Coach;
import com.udemy.learnSpring.a1.CricketCoach;
import com.udemy.learnSpring.a1.GymCoach;

public class Main {
	

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
//		@Qualifier("runningCoach")
		CricketCoach coach= (CricketCoach) context.getBean("coach",Coach.class);
		
		coach.introduce();
		System.out.println(coach.giveTasks());
		System.out.println(coach.getEmailId()+" "+coach.getTeam());
		coach.motivate();
		
		((AbstractApplicationContext) context).close();
	}

}
