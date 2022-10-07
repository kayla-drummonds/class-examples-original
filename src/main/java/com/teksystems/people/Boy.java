package com.teksystems.people;

public class Boy extends Person {

    public Boy(String name) {
        super(name);
    }
    public static double ageFactor = 1.1;
    
    public String talk() {
        return super.talk() + "... but I love Java class.";
    }
    public String walk() {
        return "I am now walking.";
    }
}
