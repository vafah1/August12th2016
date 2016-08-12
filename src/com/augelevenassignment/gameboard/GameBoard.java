package com.augelevenassignment.gameboard;

import java.util.Scanner;

import com.augelevenassignment.Human;
import com.augelevenassignment.Opponent1;
import com.augelevenassignment.Opponent2;
import com.augelevenassignment.Opponent3;

public class GameBoard {

	private static boolean stillPlaying = true;
	static Scanner sc = new Scanner(System.in);
	static String userInput = null;
	static Human player = new Human();
	static Opponent1 Roger = new Opponent1();
	static Opponent2 Bart = new Opponent2();
	static Opponent3 Bob = new Opponent3();
	static String opponent = null;
	static String playerH = null;
	static String wouldYouLikeToPlayAgain = null;
	static int uInput = 0;

	public static void main(String[] args) {

		System.out.println("Let's play Rock, Paper, Scissors");
		System.out.println("Please enter your name:\n");
		userInput = sc.nextLine();
		player.setName(userInput);
		System.out.println("What is your gender?\n");
		userInput = sc.nextLine();
		player.setGender(userInput);

		while (stillPlaying) {
			do {
				System.out.println(
						"Which opponent would you like to face?\n" + "-Roger(1)\n" + "-Bart(2)\n" + "-Bob(3)\n");
				userInput = sc.nextLine();

				Human.numberIsValid(userInput);

			} while (Human.numberIsValid(userInput));

						
			switch (userInput) {
			case "1":
				System.out.println("You have chosen to face Roger");

				playerH = player.choice();
				opponent = Roger.choice();

				GameBoard.throwDown(playerH, opponent);

				break;
			case "2":
				System.out.println("You have chosen to face Bart");

				playerH = player.choice();
				opponent = Bart.choice();

				GameBoard.throwDown(playerH, opponent);

				break;
			case "3":
				System.out.println("You have chosen to face Bob");

				playerH = player.choice();
				opponent = Bob.choice();

				GameBoard.throwDown(playerH, opponent);

				break;
				
			 default:
				 System.out.println("You have made an invalid choice.");
				 stillPlaying = true;
				 break;
			 }
			
			System.out.println("Would you like to play again?\n" + "-(Y) Yes\n" + "-(N) No");
			wouldYouLikeToPlayAgain = sc.nextLine();
			switch (wouldYouLikeToPlayAgain.toLowerCase()) {
			case "y":
				yes();
				break;
			case "n":
				no();
				break;
 			}
		}

	}

	

	public static void throwDown(String playerH, String opponent) {

		if (playerH.equals(opponent)) {
			System.out.println("It's a ties!!!");
		} else if ((playerH.equals("Rock")) && (opponent.equals("Paper"))) {
			System.out.println("Paper covers Rock, You Lose!");
		} else if ((playerH.equals("Rock")) && (opponent.equals("Scissors"))) {
			System.out.println("Rock smashes Scissors, You Win!");
		} else if ((playerH.equals("Paper")) && (opponent.equals("Rock"))) {
			System.out.println("Paper  covers Rock, You Win!");
		} else if ((playerH.equals("Paper")) && (opponent.equals("Scissors"))) {
			System.out.println("Scissors cuts Paper, You Lose!");
		} else if ((playerH.equals("Scissors")) && (opponent.equals("Rock"))) {
			System.out.println("Rock smashes Scissors, You Lose!");
		} else if ((playerH.equals("Scissors")) && (opponent.equals("Paper"))) {
			System.out.println("Scissors cuts Paper, You Win!");
		}
	}

	public static boolean yes() {
		return stillPlaying;
	}
	private static boolean no() {
		stillPlaying = false;
		return stillPlaying;
		
	}

}
