package com.gopi7211.inheritance1;//create class known as BankAccount with methods called Deposite() and Withdraw()

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void Deposite(double amount){
        balance += amount;
    }

    public void Withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
        }
        else {
            System.out.println("INSUFFICIENT BALANCE");
        }

    }

    public double getBalance() {
        return balance;
    }
}
