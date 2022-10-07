package com.teksystems;

public class MathDemo {

    public static void main(String[] args) {
	
	/*
	 * System.out.println(Math.PI); System.out.println(Math.E);
	 */
	
	/*
	 * System.out.println(Math.max(2, 3)); System.out.println(Math.max(2.5, 3));
	 * System.out.println(Math.min(2.5, 3.6)); System.out.println(Math.abs(-2));
	 * System.out.println(Math.abs(-2.1));
	 */
	
	/*
	 * int a = 10; int b = -20; System.out.println(Math.abs(a));
	 * System.out.println(Math.abs(b)); System.out.println(Math.max(a, b));
	 * System.out.println(Math.min(a, b));
	 */
	
	/*
	 * double x = 28; double y = 4;
	 * 
	 * System.out.println("Square root of y is: " + Math.sqrt(y));
	 * System.out.println("Power of x and y is: " + Math.pow(x, y));
	 * System.out.println("Logarithm of x is: " + Math.log(x));
	 * System.out.println("Logarithm of y is: " + Math.log(y));
	 * System.out.println("log10 of x is: " + Math.log10(x));
	 * System.out.println("log10 of y is: " + Math.log10(y));
	 * System.out.println("log1p of x is: " + Math.log1p(x));
	 * System.out.println("exp of x is: " + Math.exp(x));
	 */
	
	/*
	 * double d = 83.67;
	 * 
	 * System.out.println(Math.ceil(d)); System.out.println(Math.floor(d));
	 * System.out.println(Math.rint(d)); System.out.println(Math.round(d));
	 * 
	 * double a = 1.878; System.out.println(Math.round(a));
	 * 
	 * double b = 1.5; System.out.println(Math.round(b));
	 * 
	 * double c = 1.34; System.out.println(Math.round(c));
	 */
	
	int min = 100;
	int max = 1000;
	int range = (max-min) + 1;
	double d1 = Math.random() * range + min;
	int n1 = (int) (Math.random() * range + min);
	System.out.println(d1);
	System.out.println(n1);

    }

}
