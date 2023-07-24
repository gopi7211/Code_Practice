package com.gopi7211.Encapsulation2;
//Write a Java program to create a class called BankAccount with private instance variables accountNumber and balance.
// Provide public getter and setter methods to access and modify these variables.
public class Main {
    public static void main(String[] args) {
        BankAccount bankAccou = new BankAccount();

        bankAccou.setAccountNumber(78907);
        bankAccou.setBalance(1300);

        double accno = bankAccou.getAccountNumber();
        double balan = bankAccou.getBalance();

        System.out.println("The account number is:" + accno);
        System.out.println("The Balance is :" + balan);
    }
}
