package com.udemy.learnSpring.a1;

public class RunningCoach implements Coach{
	public void introduce() {
		System.out.println("I gives running training");
	}
	public String giveTasks() {
		return "Run hard 5km in 20 mis";
	}
	@Override
	public void motivate() {
		// TODO Auto-generated method stub
		
	}
}
