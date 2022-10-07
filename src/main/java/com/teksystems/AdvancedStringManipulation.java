package com.teksystems;

import java.util.StringJoiner;

public class AdvancedStringManipulation {

    public static void main(String[] args) {        
        stringBufferExamples();
    }
    
    public static void stringBufferExamples() {
        StringBuffer str = new StringBuffer("Java Full Stack Developer");
        int len = str.length();
        System.out.println("Length: " + len);
        int cap = str.capacity();
        System.out.println("Capacity: " + cap);
        
        str.append(" and Software Engineer. ");
        System.out.println(str);
        str.append("Java is my favorite language ");
        str.append("but I love Python.");
        System.out.println(str);
        
        StringBuffer stringName = new StringBuffer("Welcome to Per Scholas");
        System.out.println("Original String: " + stringName);
        stringName.reverse();
        System.out.println("Reversed String: " + stringName);
        
        StringBuffer s = new StringBuffer("Java");
        s.insert(4, "language");
        System.out.println(s);
        
        StringBuffer sT = new StringBuffer("Java");
        sT.replace(0, 2, "Hello");
        System.out.println(sT);
        
        StringBuffer str2 = new StringBuffer("Welcome to Java Full Stack ");
        System.out.println("Original string: " + str2);
        System.out.println("Substring with start index: " + str2.substring(5));
        System.out.println("Substring with start and end index: " + str2.substring(5, 10));
    }
    
    public static void stringJoinerExamples() {
        StringJoiner joinNames = new StringJoiner(",");
        joinNames.add("Java");
        joinNames.add("Python");
        joinNames.add("C Sharp");
        joinNames.add("JavaScript");
        
        System.out.println(joinNames);
        
        StringJoiner joinData = new StringJoiner(",", "[", "]");
        joinData.add("Java");  
        joinData.add("Python");  
        joinData.add("C Sharp");  
        joinData.add("JavaScript");  
        
        System.out.println(joinData);  
        
        StringJoiner joinNames1 = new StringJoiner(",", "[", "]");
        joinNames1.add("New York");  
        joinNames1.add("New Jersey");  
        
        StringJoiner joinNames2 = new StringJoiner(":", "[", "]"); 
        joinNames2.add("Dallas");  
        joinNames2.add("Chicago");  
              
        StringJoiner merge = joinNames1.merge(joinNames2);   
        System.out.println(merge); 

      }

        
    }
