package com.udemy.learnSpring.a1;

public class CricketCoach implements Coach{

	FortuneService fortuneService;
	@Override
	public void introduce() {
		System.out.println("Hey, I am cricket team's coach.");
	}

	@Override
	public String giveTasks() {
		return "Do net practice till 5pm";
	}
	
	public void setFortuneService(FortuneServiceInterface fortuneService) {
		this.fortuneService = (FortuneService) fortuneService;
	}

	@Override
	public void motivate() {
		// TODO Auto-generated method stub
		fortuneService.motivate();
	}

}
