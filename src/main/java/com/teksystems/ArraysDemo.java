package com.teksystems;

import java.util.Scanner;

public class ArraysDemo {

    public static void main(String[] args) {
	insertElements();

    }
    
    public static void arrayDemoOne() {
	int[] age = {12, 4, 5, 2, 5};
	
	System.out.println("Accessing Elements of an Array: ");
	System.out.println("First element: " + age[0]);
	System.out.println("Second element: " + age[1]);
	System.out.println("Third element: " + age[2]);
	System.out.println("Fourth element: " + age[3]);
	System.out.println("Fifth element: " + age[4]);
    }
    
    public static void arrayDemoTwo() {
	int[] age = {12, 4, 5};
	System.out.println("Using for loop: ");
	for(int i = 0; i < age.length; i++) {
	    System.out.println(age[i]);
	}
    }
    
    public static void enhancedForLoop() {
	String[] names = {"New York", "Dallas", "Las Vegas", "Florida"};
	for(String name : names) {
	    System.out.println(name);
	}
    }
    
    public static void arrayDemoThree() {
	int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
	int sum = 0;
	Double average;
	
	for(int number : numbers) {
	    sum += number;
	}
	
	int arrayLength = numbers.length;
	average = ((double)sum / (double)arrayLength);
	
	System.out.println("Sum = " + sum);
	System.out.println("Average = " + average);
    }
    
    public static void meanSDArray() {
	int[] marks = {74, 43, 58, 60, 90, 64, 70};
	int sum = 0;
	int sumSq = 0;
	double mean, stdDev;
	
	for(int i = 0; i < marks.length; i++) {
	    sum += marks[i];
	    sumSq += marks[i] * marks[i];
	}
	mean = (double)sum/marks.length;
	stdDev = Math.sqrt((double)sumSq/marks.length - mean * mean);
	System.out.println("Mean is: " + mean);
	System.out.println("Standard deviation is: " + stdDev);
	
    }
    
    public static void insertElements() {
	int i, element;
	int[] arr = new int[11];
	try (Scanner scan = new Scanner(System.in)) {
	    System.out.println("Enter 10 elements: ");
	    for(i=0; i<10; i++) {
	        arr[i] = scan.nextInt();
	    }
	    
	    System.out.println("Enter an element to insert: ");
	    element = scan.nextInt();
	    arr[i] = element;
	    
	    System.out.println("Now the new array is: ");
	    for(i= 0; i < 11; i++) {
	        System.out.println(arr[i] + " ");
	    }
	    
	    scan.close();
	}
    }

}
