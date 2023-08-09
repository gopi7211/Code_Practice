package com.gopi7211.Interface2;

class SavingAccount implements Account{
    private double balance;
    private  double interesrRate;

    public SavingAccount(double initialDeposite, double interesrRate){
        this.balance = initialDeposite;
        this.interesrRate = interesrRate;
    }

    @Override
    public void deposite(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public void applyInterest(){
        balance += balance * interesrRate/100;
    }
}
