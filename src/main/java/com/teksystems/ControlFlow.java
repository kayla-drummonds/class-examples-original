package com.teksystems;

import java.util.Scanner;

public class ControlFlow {

    public static void main(String[] args) {
	problem7();
    }
    
    public static void problem4() {
	int x = 15;
	
	if (x < 10 || x > 20) {
	    System.out.println("Out of range");
	} else if (x >= 10 && x <= 20) {
	    System.out.println("In range");
	}
    }
    
    public static void problem5() {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter grade: ");
	int grade = scan.nextInt();
	
	if (grade >= 90 && grade <= 100) {
	    System.out.println("A");
	} else if (grade >= 80 && grade <= 89) {
	    System.out.println("B");
	} else if (grade >= 70 && grade <= 79) {
	    System.out.println("C");
	} else if (grade >= 60 && grade <= 69) {
	    System.out.println("D");
	} else if (grade < 60) {
	    System.out.println("F");
	} else if (grade < 0 || grade > 100) {
	    System.out.println("Score out of range");
	}
	scan.close();
    }
    
    public static void problem7() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter an integer between 1 and 7");
	int day = sc.nextInt();
	switch (day) {
	    case 1: 
		System.out.println("Sunday");
		break;
	    case 2:
		System.out.println("Monday");
		break;
	    case 3:
		System.out.println("Tuesday");
		break;
	    case 4:
		System.out.println("Wednesday");
		break;
	    case 5:
		System.out.println("Thursday");
		break;
	    case 6:
		System.out.println("Friday");
		break;
	    case 7:
		System.out.println("Saturday");
		break;
	    default:
		System.out.println("Out of range");
	}
	sc.close();
	
    }

}
