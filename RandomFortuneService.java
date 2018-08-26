package com.Luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	// create an array of strings
	private String[] phrases = {
			"Beware of the wolf in sheep clothing",
			"Diligence is the mother of good fortune",
			"The journey is the reward"
	};
	
	// create a random number generator
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(phrases.length);
		
		String theFortune = phrases[index];
		
		return theFortune;
	}

}
