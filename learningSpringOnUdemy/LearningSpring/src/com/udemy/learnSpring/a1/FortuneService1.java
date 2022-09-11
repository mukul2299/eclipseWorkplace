package com.udemy.learnSpring.a1;
import java.util.Random;

public class FortuneService1 implements FortuneServiceInterface{
	String[] fortunes= {"Today is your last day","You can do this Mdafka","Keep it up champ"};
	@Override
	public void motivate() {
		// TODO Auto-generated method stub
		Random rand= new Random();
		System.out.println(fortunes[rand.nextInt(3)]);
	}

}
