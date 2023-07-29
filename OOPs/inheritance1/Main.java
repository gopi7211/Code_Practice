package com.gopi7211.inheritance1;// create class known as BankAccount with methods called Deposite() and Withdraw()
// create sub class called SavingAccount that overrides the Withdraw() method to prevent withdraw
// if the account balance fallow one hundred

public class Main {
    public static void main(String[] args) {
        System.out.println("Create a Bank object (A/c no. BA1234) with initial Balance $500 :");
        // object for bankaccount
        BankAccount BA123 = new BankAccount("BA123",500);

        // Deposite $1000 into account
        System.out.println("after depositing $1000 into account");
        BA123.Deposite(1000);
        System.out.println("Balance" + BA123.getBalance());


    }
}


