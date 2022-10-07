package com.teksystems.inheritance;

public class SavingsAccount extends BankAccount {
    
    @Override
    public void deposit(double amount) {
        
        System.out.println("Running deposit in savings account class");
        amount = amount * 1.05;
        super.deposit(amount);
    }
}
