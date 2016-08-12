package com.augelevenassignment;

import java.util.Random;

public class Opponent3 extends Users {
	
	String name = "Bob";
	String [] rps = new String[] {"Rock", "Paper", "Scissors"};

	

	public Opponent3(String name, String gender) {
		super(name, gender);
	}

	public Opponent3() {
	
	}
	
	@Override
	public void numberIsValid() {
		
	}

	@Override
	public String choice() {
		String random = (rps[new Random().nextInt((rps.length)-2)]);
		System.out.println(name + " has chosen " + random);
		return random;	
	}

	
	
}
