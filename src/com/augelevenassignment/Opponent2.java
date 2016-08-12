package com.augelevenassignment;

import java.util.Random;

public class Opponent2 extends Users{
	
	String name = "Bart";
	String [] rps = new String[] {"Rock", "Paper", "Scissors"};


	public Opponent2(String name, String gender) {
		super(name, gender);
	}

	public Opponent2( ) {

	}
	
	@Override
	public void numberIsValid() {
		
	}

	@Override
	public String choice() {
		String name = "Bart";
		String random = (rps[new Random().nextInt((rps.length)-1)]);
		System.out.println(name + " has chosen " + random);
		return random;	
		
		
	}

	

}
