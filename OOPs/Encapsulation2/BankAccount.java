package com.gopi7211.Encapsulation2;
//Write a Java program to create a class called BankAccount with private instance variables accountNumber and balance.
// Provide public getter and setter methods to access and modify these variables.
public class BankAccount {
    private double accountNumber;
    private  double balance;

    public double getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return  balance;
    }
    public void setAccountNumber(double accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
