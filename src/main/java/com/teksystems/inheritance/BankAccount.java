package com.teksystems.inheritance;

public class BankAccount {

    public static final double INTEREST_RATE = 0.01;
    private double balance = 0.0;
    
    public static double calculateInterest(double amount) {
        return amount * INTEREST_RATE;
    }
    
    public void deposit(double amount) {
        System.out.println("Running deposit in bank account class");
        balance = balance + amount;
    }
    
    public boolean withdrawal(double amount) {
        if(amount <= balance) {
            return true;
        } else {
            return false;
        }
    }
    
    public String toString() {
        return "The balance is " + balance;
    }
    
    
}
