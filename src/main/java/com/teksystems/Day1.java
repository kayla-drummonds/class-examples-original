package com.teksystems;

public class Day1 {

    public static void main(String[] args) {
	byte num = 113;
	System.out.println(num);

	short snum = 150;
	System.out.println(snum);

	long lnum = -12332252626L;
	System.out.println(lnum);

	double dnum = -42937737.9d;
	System.out.println(dnum);

	float fnum = 19.98f;
	System.out.println(fnum);

	boolean b = false;
	System.out.println(b);

	char ch = 'Z';
	System.out.println(ch);

	System.out.println("This will print on\r\ntwo lines.");
	System.out.println("She said \"Hello\" to me!");
	System.out.println("This will print two back-slashes: \\\\");

	String username = "popcorn";
	String password = "123456";

	username = "pop".concat(password);

	System.out.println(username);
    }

}
