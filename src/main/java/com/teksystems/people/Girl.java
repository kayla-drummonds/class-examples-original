package com.teksystems.people;

public class Girl extends Person{

    public static double ageFactor = 1.3;
    
    public Girl(String name) {
        super(name);
        name = "Ms. " + name;
    }
    
    public String talk() {
        return "Hello! " + jump();
    }
    
    public String jump() {
        return "I am jumping";
    }
    
    public static double lifeApan() {
        return lifeSpan * ageFactor;
    }

}
