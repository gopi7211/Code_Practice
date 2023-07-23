package com.gopi7211.Abstraction2;
//Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw().
// Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount
// class and implement the respective methods to handle deposits and withdrawals for each account type.
public class Main {
    public static void main(String[] args) {
        double idal,damt,wamt;
        idal = 1000.0;
        SavingAccount savingAccount = new SavingAccount("SA001",idal);
        System.out.println("Saving account Inital balance " + idal);

        damt = 500.0;
        savingAccount.Deposit(damt);

        wamt = 250;
        savingAccount.Withdraw(wamt);


        //Current Account

        idal = 500.0;
        CurrentAccount currentAccount = new CurrentAccount("SA001",idal);
        System.out.println("Saving account Inital balance " + idal);

        damt = 200.0;
        currentAccount.Deposit(damt);

        wamt = 290;
        currentAccount.Withdraw(wamt);
    }
}
