package com.teksystems;

import java.util.Scanner;

public class IfStatements {

    /*
     * public static void calcBodyMassIndex() { Scanner scan = new
     * Scanner(System.in); System.out.println("Enter weight in kg: "); double weight
     * = scan.nextDouble(); System.out.println("Enter height in meters: "); double
     * height = scan.nextDouble(); double bmi = weight / (height * height);
     * 
     * if (bmi < 18.5) { System.out.println("BMI: " + bmi + ", underweight"); } else
     * if (bmi >= 18.5 && bmi < 25.0) { System.out.println("BMI: " + bmi +
     * ", normal"); } else if (bmi >= 25 && bmi < 30.0) { System.out.println("BMI: "
     * + bmi + ", overweight"); } else if (bmi <= 30) { System.out.println("BMI: " +
     * bmi + ", obese"); } else { System.out.println("unknown BMI"); } scan.close();
     * }
     */

    public static void main(String[] args) {

	// calcBodyMassIndex();
	isLeapYear();

    }
    
    public static void isLeapYear() {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter a year: ");
	int year = scan.nextInt();
	
	if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
	    System.out.println(year + " is a leap year");
	} else {
	    System.out.println(year + " is not a leap year");
	}
	
	scan.close();
    }

}
