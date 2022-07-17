package com.udemy.learnSpring.a1;

public class FotuneService implements FortuneServiceInterface{

	@Override
	public void motivate() {
		System.out.println("Today is last day on earth");
	}

}
