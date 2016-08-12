package com.augelevenassignment;

import java.util.Random;

public class Opponent1 extends Users{

	String name = "Roger";
	String [] rps = new String[] {"Rock", "Paper", "Scissors"};

	public Opponent1(String name, String gender) {
		super(name, gender);


	}

	public Opponent1() {

	}

	@Override
	public void numberIsValid() {
  

	}

	@Override
	public String choice() {
		String name = "Roger";

		String random = (rps[new Random().nextInt(rps.length)]);
		System.out.println(name + " has chosen " + random);
		return random;
	}


}
