package com.xowkz.bankkk;

import com.xowkz.bankkk.bankaccount.BankAccount;
import com.xowkz.bankkk.savingsaccount.SavingsAccount;

public class BankRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        SavingsAccount savingsAccount=new SavingsAccount();
        savingsAccount.getBalance();
        System.out.println("Account with zero balance: "+savingsAccount.getBalance());

        savingsAccount.deposit( 1000);
        System.out.println("Minimum balance: "+savingsAccount.getBalance());

        savingsAccount.deposit(200);
        System.out.println("Deposited amount: "+savingsAccount.getBalance());

        savingsAccount.withdraw(300);
        System.out.println("Amount after withdraw: "+savingsAccount.getBalance());

        savingsAccount.rateOfInterest();
        System.out.println("Rate of Interest: "+savingsAccount.getBalance());
        System.out.println("********************************************************************************************");

        SavingsAccount savingsAccount1=new SavingsAccount();
        System.out.println("Account with zero balance : "+savingsAccount1.getBalance());
        savingsAccount1.SavingsAccount(500);
        System.out.println("Savings Account with minimum balance: "+savingsAccount1.getBalance());
        savingsAccount1.deposit(200);
        System.out.println("Total amount after deposit: "+savingsAccount1.getBalance());
        savingsAccount1.withdraw(100);
        System.out.println("Amount after Withdraw: "+savingsAccount1.getBalance());
        savingsAccount1.getBalance();
        System.out.println("Closing amount: "+savingsAccount1.getBalance());
        savingsAccount1.rateOfInterest();
        System.out.println("Rate of Interest added: "+savingsAccount1.getBalance());
        System.out.println("********************************************************************************************");
        SavingsAccount savingsAccount2=new SavingsAccount();
        System.out.println("Savings Account with zero balance: "+savingsAccount2.getBalance());
        savingsAccount2.SavingsAccount(5000);
        System.out.println("Savings account with minimum balance: "+savingsAccount2.getBalance());
        savingsAccount2.deposit(500);
        System.out.println("Total amount after deposit: "+savingsAccount2.getBalance());
        savingsAccount2.withdraw(500);
        System.out.println("Total amount after withdraw: "+savingsAccount2.getBalance());
        System.out.println("closing amount"+savingsAccount2.getBalance());
        savingsAccount2.rateOfInterest();
        System.out.println("Rate of Interest: "+savingsAccount2.getBalance());
        System.out.println("********************************************************************************************");
        SavingsAccount savingsAccount3=new SavingsAccount();
        System.out.println("Savings account with zero balance: "+savingsAccount3.getBalance());
        savingsAccount3.SavingsAccount(3000);
        System.out.println("Savings account with minimum balance: "+savingsAccount3.getBalance());
        savingsAccount3.deposit(500);
        System.out.println("Total amount after deposit: "+savingsAccount3.getBalance());
        savingsAccount3.withdraw(200);
        System.out.println("Total amount after withdraw: "+savingsAccount3.getBalance());
        System.out.println("Closing Amount: "+savingsAccount3.getBalance());
        savingsAccount3.rateOfInterest();
        System.out.println("Rate of Interest: "+savingsAccount3.getBalance());
        System.out.println("********************************************************************************************");
        SavingsAccount savingsAccount4=new SavingsAccount();
        System.out.println("Savings account with zero balance: "+savingsAccount4.getBalance());
        savingsAccount4.SavingsAccount(2000);
        System.out.println("Savings Account with minimum balance: "+savingsAccount4.getBalance());
        savingsAccount4.deposit(5000);
        System.out.println("Total amount after deposit: "+savingsAccount4.getBalance());
        savingsAccount4.withdraw(100);
        System.out.println("Total amount after withdrawal: "+savingsAccount4.getBalance());
        System.out.println("Closing amount: "+savingsAccount4.getBalance());
        savingsAccount4.rateOfInterest();
        System.out.println("Rate of interest is: "+savingsAccount4.getBalance());
        System.out.println("********************************************************************************************");
        SavingsAccount savingsAccount5=new SavingsAccount();
        System.out.println("Saving Account with zero balance: "+savingsAccount5.getBalance());
        savingsAccount5.SavingsAccount(6000);
        System.out.println("Savings account with minimum balance: "+savingsAccount5.getBalance());
        savingsAccount5.deposit(300);
        System.out.println("Total amount after deposit: "+savingsAccount5.getBalance());
        savingsAccount5.withdraw(500);
        System.out.println("Remaining amount: "+savingsAccount5.getBalance());
        System.out.println("Closing amount: "+savingsAccount5.getBalance());
        savingsAccount5.rateOfInterest();
        System.out.println("Rate of interest: "+savingsAccount5.getBalance());
        System.out.println("********************************************************************************************");
        SavingsAccount savingsAccount6=new SavingsAccount();
        System.out.println("Savings Account with zero balance: "+savingsAccount6.getBalance());
        savingsAccount6.SavingsAccount(2500);
        System.out.println("Savings account with minimum balance: "+savingsAccount6.getBalance());
        savingsAccount6.deposit(300);
        System.out.println("Total amount after deposit: "+savingsAccount6.getBalance());
        savingsAccount6.withdraw(500);
        System.out.println("remaining amount after withdraw: "+savingsAccount6.getBalance());
        savingsAccount6.rateOfInterest();
        System.out.println("Rate of interest added: "+savingsAccount6.getBalance());
        System.out.println("********************************************************************************************");

        System.out.println("main ended");
    }
}
