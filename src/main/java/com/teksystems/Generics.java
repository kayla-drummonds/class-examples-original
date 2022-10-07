package com.teksystems;

import java.util.ArrayList;
import java.util.Arrays;
// import java.util.Iterator;
// import java.util.LinkedList;
import java.util.List;

public class Generics {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();

        list1.add("String1");
        list1.add("String2");
        list1.add("String3");

        printList(list1);
        
        List<String> list2 = new ArrayList<>();

        list2.add("String4");
        list2.add("String5");
        list2.add("String6");
        
        printList(list2);

        list1.addAll(list2);
        
        printList(list1);
        
        list1.remove(4);
        printList(list1);
        
        String a = list1.get(3);
        System.out.println("a = " + a);
        
        if(list1.contains("String1")) {
            System.out.println("List 1 contains String 1");
        }
        
        list1.add(1, "Inserted String");
        printList(list1);
        
        String[] arr = new String[5];
        arr[0] = "Java";
        arr[1] = "Python";
        arr[2] = "JavaScript";
        arr[3] = "ReactJs";
        
        List<String> listObj = Arrays.asList(arr);
        printList(listObj);
        
        // List<String> linked = new LinkedList<>();

    }
    
    public static void printList(List<String> list) {
        System.out.println("--------------------------------");
        
        /*
         * Iterator<String> it = list.iterator();
         * while(it.hasNext()) {
         * String s = it.next();
         * System.out.println(s);
         * }
         */
        
        for (String s : list) {
            System.out.println(s);
        }
    }

}
