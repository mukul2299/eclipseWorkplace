package com.udemy.learnSpring.a1;

import org.springframework.beans.factory.DisposableBean;

public class CricketCoach implements Coach , DisposableBean{

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	CricketCoach(FortuneServiceInterface fortune){
		this.fortuneService= fortune;
	}
	FortuneServiceInterface fortuneService;
	private String emailId;
	private String team;
	@Override
	public void introduce() {
		System.out.println("Hey, I am cricket team's coach.");
	}

	@Override
	public String giveTasks() {
		return "Do net practice till 5pm";
	}
	
//	public void setFortuneService(FortuneServiceInterface fortuneService) {
//		this.fortuneService = (FortuneService1) fortuneService;
//	}

	@Override
	public void motivate() {
		// TODO Auto-generated method stub
		fortuneService.motivate();
	}
	public void newBorn() {
		System.out.println("New Bean created. Hi cricket coach bean.");
	}
	

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Bean going to destroy. Bye cricket coach bean.");
		
	}

}
