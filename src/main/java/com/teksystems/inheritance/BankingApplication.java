package com.teksystems.inheritance;

public class BankingApplication {

    public static void main(String[] args) {
        CheckingAccount ca = new CheckingAccount();
        SavingsAccount sa = new SavingsAccount();
        
        BankAccount ba = new SavingsAccount();
        
        BankAccount account[] = new BankAccount[2];
        account[0] = ca;
        account[1] = sa;
        
        BankAccount.calculateInterest(100);
        
        ba.deposit(100);
        System.out.println("Bank account " + ba.toString());
        
        sa.deposit(100.0);
        System.out.println("Savings " + sa.toString());
        
        ca.deposit(200.0);
        System.out.println("Checking " + ca.toString());
        
        sa.deposit(100.0);
        System.out.println("Savings " + sa.toString());
    }

}
