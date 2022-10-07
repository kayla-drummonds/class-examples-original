package com.teksystems.arrayList;

import java.util.ArrayList;
import java.util.List;

public class SearchElementsInArrayList {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Steve");
        names.add("John");
        names.add("Steve");
        names.add("Maria");
        
        System.out.println("Does names array contain \"Bob\"? : " + names.contains("Bob"));
        
        System.out.println("index of \"Steve\" : " + names.indexOf("Steve"));
        System.out.println("index of \"Mark\" : " + names.indexOf("Mark"));
        
        System.out.println("lastIndex of \"John\" : " + names.lastIndexOf("John"));
        System.out.println("lastIndex of \"Bill\" : " + names.lastIndexOf("Bill"));
    }

}
