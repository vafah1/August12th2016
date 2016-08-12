package com.augelevenassignment;

import java.util.Scanner;

public class Human extends Users {

	protected boolean userFailed = false;
	Scanner sc = new Scanner(System.in);
	protected String userInput = null;
	protected int numberInput = 0;
	String [] rps = new String[] {"Rock", "Paper", "Scissors"};


	public Human(String name, String Gender) {
		super(name, Gender);
	}

	public Human(){

	}


	public static boolean numberIsValid(String numberInput) {

		if (numberInput.equals("1") ||numberInput.equals("2") || numberInput.equals("3")){

			try {
				int number = Integer.parseInt(numberInput);
				return false;
			} catch (NumberFormatException e) {
				return true;
			}
		}
		return false;
	}


	public String choice() {

		String choice = null;

		do {

			userFailed = false;

			System.out.println("Would you like to select:\n"
					+ "-Rock(1)\n"
					+ "-Paper(2)\n"
					+ "-Scissors(3)\n");
			userInput = sc.nextLine();
			userFailed = numberIsValid(userInput);

			int number = Integer.parseInt(userInput);

			if (number < 1 || number > 4) {
				userFailed = true;
			}


			try {
				choice = rps[number - 1];
			} catch (ArrayIndexOutOfBoundsException e) {
				userFailed = true;
				System.out.println("Please enter a valid number.");
			}

		} while (userFailed);



		System.out.println("You have selected " + choice);
		return choice;
	}




}
