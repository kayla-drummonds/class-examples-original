package com.teksystems.futureTuition;

import java.text.NumberFormat;
import java.util.Locale;

public class FutureTuition {

    public static final double INCREASE_PERCENTAGE = 1.07;

    // private int tuition = 0;

    public FutureTuition() {
        
    }

    public double futureTuition(int tuition) {
        double futureTuition = tuition;
        int year = 0;

        System.out.println("Year\tTuition");

        while (futureTuition <= tuition * 2) {
            futureTuition = calculateTuition(futureTuition);
            year = year + 1;
            NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);

            System.out.println(year + "\t" + nf.format(futureTuition));
        }
        return futureTuition;
    }

    private double calculateTuition(double tuition) {
        double futureTuition = INCREASE_PERCENTAGE * tuition;
        return futureTuition;
    }


}
