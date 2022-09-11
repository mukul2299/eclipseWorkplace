package com.udemy.learnSpring.a1;

public class FortuneService implements FortuneServiceInterface{

	@Override
	public void motivate() {
		System.out.println("Today is last day on earth");
	}

}
