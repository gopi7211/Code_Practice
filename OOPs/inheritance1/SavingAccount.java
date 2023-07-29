package com.gopi7211.inheritance1;
// create sub class called SavingAccount that overrides the Withdraw() method to prevent withdraw
// if the account balance fallow one hundred
public class SavingAccount extends BankAccount{

    public SavingAccount(String accountNumber, double balance){
        super(accountNumber, balance);
    }

    public  void  withdraw(double amount){
        if (getBalance() - amount<100){
            System.out.println("MINIMUM BALANCE OF $100 REQUIRED");
        } else {
            super.Withdraw(amount);
        }
    }
}
