package com.teksystems.library;

public class LibraryInterfaceDemo {

    public static void main(String[] args) {
        
        
        System.out.println("============== Kid 1 ============");
        KidUser kid1 = new KidUser();
        kid1.setAge(10);
        kid1.registerAccount();
        kid1.setBookType("Kids");
        kid1.requestBook();
        
        System.out.println("============== Kid 2 ============");
        KidUser kid2 = new KidUser();
        kid2.setAge(18);
        kid2.registerAccount();
        kid2.setBookType("Fiction");
        kid2.requestBook();
        
        System.out.println("============== Adult 1 ============");
        AdultUser adult1 = new AdultUser();
        adult1.setAge(5);
        adult1.registerAccount();
        adult1.setBookType("Kids");
        adult1.requestBook();
        
        System.out.println("============== Adult 2 ============");
        AdultUser adult2 = new AdultUser();
        adult2.setAge(23);
        adult2.registerAccount();
        adult2.setBookType("Fiction");
        adult2.requestBook();

    }

}
