package com.gopi7211.Abstraction2;

    class SavingAccount extends BankAccount{
        public SavingAccount(String accountNumber, double balance){
            super(accountNumber,balance);

        }


        @Override
        void Deposit(double amount) {
            setBalance(getBalance() + amount);
            System.out.println("Deposite of $" +amount+ "sucessful. Current balance : $" + getBalance());
        }

        @Override
        void Withdraw(double amount) {
            if(getBalance()>= amount){
                setBalance(getBalance()-amount);
                System.out.println("Withdraw of $" +amount+ "sucessful. Current balance : $" + getBalance());
            }
            else {
                System.out.println("INSUFICIENT BALANCE");
            }
        }
    }
