package com.teksystems.futureTuition;

public class FutureTuitionApp {
    public static void main(String[] args) {
        FutureTuition ft = new FutureTuition();
        
        int x = 40000;
        int y = 60000;
        
        double costX = ft.futureTuition(x);
        double costY = ft.futureTuition(y);
        
        System.out.println(y + " costs " + (costY - costX) + " more than " + x + " over 11 years");
        
    }
}
