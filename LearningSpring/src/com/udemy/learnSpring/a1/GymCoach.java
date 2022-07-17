package com.udemy.learnSpring.a1;

public class GymCoach implements Coach{
	FortuneServiceInterface fortune;
	GymCoach(FotuneService fortune){
		this.fortune=fortune;
	}
	@Override
	public void introduce() {
		System.out.println("I gives gym training");
	}

	@Override
	public String giveTasks() {
		return "Do 20 bench press";
	}
	
	public void motivate() {
		fortune.motivate();
	}

}
