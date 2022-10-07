package com.teksystems;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {
	    futureTuition();
	}

	public static void forLoopExample() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Welcome to Java World! " + i);
		}

		System.out.println("================================");

		for (int i = 10; i > 0; i--) {
			System.out.println("Welcome to Java World! " + i);
		}
	}

	// print all numbers divisible by 5 with no remainder between 1 and 100

	public static void divisibleByFive() {
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void nestedLoopExample() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > 0; j--) {
				System.out.println(i + "\t" + j);
			}
		}
	}

	public static void palindrome() {
		String original;
		String reverse = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string/number to check if it is a palindrome.");
		original = in.nextLine();

		int length = original.length();
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);
		if (original.equals(reverse)) {
			System.out.println("Entered string/number is a palindrome.");
		} else {
			System.out.println("Entered string/number is not a palindrome.");
		}

		in.close();
	}

	public static void subtractionQuiz() {
		final int NUMBER_OF_QUESTIONS = 5;

		Scanner scan = new Scanner(System.in);

		// use break statement when the user does not want to play anymore

		while (true) {
			int correctCount = 0;
			int incorrectCount = 0;
			int count = 0;
			long startTime = System.currentTimeMillis();

			while (count < NUMBER_OF_QUESTIONS) {

				int number1 = (int) (Math.random() * 10);
				int number2 = (int) (Math.random() * 10);

				if (number1 < number2) {
					int temp = number1;
					number1 = number2;
					number2 = temp;
				}

				System.out.println("What is " + number1 + " - " + number2 + "? ");
				int answer = scan.nextInt();

				if (number1 - number2 == answer) {
					System.out.println("You are correct!");
					correctCount++;
				} else {
					System.out.println(
							"Your answer is incorrect.\n" + number1 + " - " + number2 + " is " + (number1 - number2));
					incorrectCount++;
				}

				count++;
			}

			long endTime = System.currentTimeMillis();

			System.out.println("You answered " + correctCount + " questions correctly and " + incorrectCount
					+ " questions incorrectly.");
			System.out.println("The program ran for " + (endTime - startTime) / 1000 + " seconds.");

			System.out.println("Would you like to play again? Enter Y or N.");
			String tryAgain = scan.next();

			if (!tryAgain.equalsIgnoreCase("Y")) {
				System.out.println("Thanks for playing!");
				break;
			}
		}

		scan.close();
	}

	public static void breakContinue() {
		System.out.println("Starting the loop");

		// try to change this so that any odd number will continue
		// if i = 4 then print the message and then break the loop
		// actual output should be 2 and 4
		for (int i = 1; i <= 5; i++) {
			if (i % 2 != 0) {
				continue;
			}

			if (i == 4) {
				System.out.println(i);
				break;
			}

			System.out.println(i);
		}

		System.out.println("Ending the loop");
	}

	public static void multiplicationTable() {
	    for(int row = 1; row <= 12; row++) {
		for(int col = 1; col <= 12; col++) {
		    int product = col * row;
		    System.out.print(product + "\t");
		}
		System.out.print("\n");
	    }
	}
	
	public static void futureTuition() {
	    
	    final double INCREASE_PERCENTAGE = 1.07;
	    int tuition = 10000;
	    double futureTuition = tuition;
	    int year = 0;
	    
	    System.out.println("Year\tTuition");
	    
	    while (futureTuition <= tuition * 2) {
		futureTuition = INCREASE_PERCENTAGE * futureTuition;
		year = year + 1;
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
		//System.out.printf("%d\t%s\n", year, nf.format(futureTuition));
		System.out.println(year + "\t" + nf.format(futureTuition));
	    }
	}
}
