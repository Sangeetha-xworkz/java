package com.xowkz.bankkk.bankaccount;

public class BankAccount {
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }


    public double deposit(double amount){
        if (amount>0)
            balance=balance+amount;
        else System.out.println("amount should be more than zero");
        return balance;
    }

    public double withdraw(double amount){
        if (amount<=balance)
            balance=balance-amount;
        else System.out.println("Insufficient balance");
        return balance;
    }
}
