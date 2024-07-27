package com.xworkz.bankaccount;

import com.xworkz.bankaccount.dao.AccountDetailsDao;
import com.xworkz.bankaccount.dto.AccountDetailsDto;

public class AccountDetailsRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        AccountDetailsDto some=new AccountDetailsDto();
        some.bankName="SBI";
        some.branchName="Hassan Circle Tiptur";
        some.ifscCode="123SICFR453";
        some.accountNumber=12323432454356l;
        some.address="Tiptur";
        some.accountType="Savings Accont";

        AccountDetailsDao acc=new AccountDetailsDao();
        boolean ref=acc.createBankAccount(some);
        System.out.println("Bank Account Created: "+ref);

        acc.getAccountInfo();
        System.out.println("main ended");

    }
}
