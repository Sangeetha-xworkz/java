package com.xowkz.bankkk.savingsaccount;

import com.xowkz.bankkk.bankaccount.BankAccount;

public class SavingsAccount extends BankAccount {

    public double interest=6.5;


    //account creation with zero balance
    public void SavingsAccount(){

    }

    //account with minimum balance
    public void SavingsAccount(double minBalance){
        setBalance(minBalance);
        System.out.println("Account should have minimum balance");
    }

    public void rateOfInterest(){

        interest =getBalance()*interest/100;
        deposit(interest);
    }
}
