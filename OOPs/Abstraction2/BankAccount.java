package com.gopi7211.Abstraction2;

abstract class BankAccount {
    public String accountNumber;
    private   double balance;

    public BankAccount(String accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }


    abstract void Deposit(double amount);
    abstract  void Withdraw(double amount);

}
