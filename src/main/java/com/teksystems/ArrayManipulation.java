package com.teksystems;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulation {

    public static void main(String[] args) {
	anotherSortExample();
    }

    public static void fillExample() {
	int[] dValues = new int[10];
	Arrays.fill(dValues, 6);
	for (int i : dValues) {
	    System.out.println(dValues[i]);
	}

	long[] lValues = new long[10];
	Arrays.fill(lValues, 2057);
	System.out.println(Arrays.toString(lValues));

	int ar[] = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
	Arrays.fill(ar, 1, 5, 10);
	System.out.println(Arrays.toString(ar));

    }

    public static void sortExample() {
	String[] days = { "Mon", "Tues", "W", "Thurs", "Fri" };
	// double[] values = new double[10];

	System.out.println("Before " + Arrays.toString(days));
	Arrays.sort(days);
	System.out.println("Sorted " + Arrays.toString(days));
    }

    public static void forLoopCopy() {
	int[] sourceArrays = { 2, 3, 4, 5, 10 };
	int[] targetArrays = new int[sourceArrays.length];

	for (int i = 0; i < sourceArrays[i]; i++) {
	    targetArrays[i] = sourceArrays[i];
	}

	System.out.println(Arrays.toString(sourceArrays));
	System.out.println(Arrays.toString(targetArrays));

	if (targetArrays == sourceArrays) {
	    System.out.println("Same instance");
	} else {
	    System.out.println("Different instance");
	}
    }

    public static void cloneExample() {
	int[] sourceArray = { 1, 2, 3 };
	int[] targetArray = sourceArray.clone();
	sourceArray[2] = 500;

	System.out.println("Source Array: " + Arrays.toString(sourceArray));
	System.out.println("Target Array: " + Arrays.toString(targetArray));
    }

    public static void inputExample() {
	int n;
	Scanner sc = new Scanner(System.in);
	
	// reading the number of elements from the that we want to enter
	System.out.print("Enter the number of elements you want to store: ");
	n = sc.nextInt();
	
	// creates an array in the memory of length 10
	int[] array = new int[10];
	
	
	// reading array elements from the user
	for (int i = 0; i < n; i++) {
	    System.out.println("Enter element " + i + " of the array: ");
	    array[i] = sc.nextInt();
	}
	
	// accessing array elements using the for loop
	System.out.println("Array elements are: ");
	/*
	 * System.out.println(Arrays.toString(array)); for (int i = 0; i < n; i++) {
	 * System.out.println(array[i]); }
	 */
	
	//print out a comma separated list of the elements such as "1, 2, 3, 4, 5"
	for (int i = 0; i < n; i++) {
	    System.out.print(array[i]);
	    if(i < n-1) {
		System.out.print(", ");
	    }
	}
	sc.close();
    }
    
    public static void anotherSortExample() {
	int[] sort = {10,2,99,4,3,2,1,5,7,8};
	
	for (int i = 0; i < sort.length; i++) {
	    for (int j = i + 1; j < sort.length; j++) {
		if(sort[i] > sort[j]) {
		    int temp = sort[i];
		    sort[i] = sort[j];
		    sort[j] = temp;
		}
	    }
	    System.out.print(sort[i] + " ");
	}
	
	
    }

}
