package com.teksystems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.teksystems.coffeeShop.MenuItem;

public class MapsDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("position 0");
        list.add("position 1");
        list.add("position 0");
        list.add("position 0");
        list.add("position 0");
        list.add("position 0");
        
        for(String s : list) {
            System.out.println(s);
        }
        
        System.out.println("######################");
        
        Set<String> set = new HashSet<>();
        set.add("position 0");
        set.add("position 1");
        set.add("position 0");
        set.add("position 0");
        
        for(String s : set) {
            System.out.println(s);
        }
        
        System.out.println("######################");
        
        HashMap<String, String> map = new HashMap<>();
        map.put("eric", "Eric Heilig");
        map.put("londen", "Londen Haskin");
        
        System.out.println(map.get("eric"));
        System.out.println(map.get("londen"));
        
        System.out.println("######################");
        
        HashMap<String, Integer> grades = new HashMap<>();
        grades.put("eric", 100);
        grades.put("joe", 90);
        System.out.println(grades.get("eric"));
        System.out.println(grades.get("joe"));
        
        System.out.println("######################");
        HashMap<String, MenuItem> menuItems = new HashMap<>();
        
        menuItems.put("juice", new MenuItem("cranberry juice", "drink", 3.36));
        System.out.println("1) Item name is " + menuItems.get("juice").getItem());
        
        menuItems.put("juice", new MenuItem("apple juice", "drink", 2.36));
        MenuItem item1 = menuItems.get("juice");
        System.out.println("2) Item name is " + item1.getItem());
        
        menuItems.put("lemonade", new MenuItem("lemonade", "drink", 0.85));
        MenuItem item = menuItems.get("lemonade");
        System.out.println("3) Item name is " + item.getItem());
        
        
    }

}
