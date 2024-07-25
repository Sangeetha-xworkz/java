package com.xworkz.bankaccount.dao;
import com.xworkz.bankaccount.dto.AccountDetailsDto;

public class AccountDetailsDao {
    AccountDetailsDto some;
    public boolean createBankAccount(AccountDetailsDto some){

         boolean isAccountCreated=false;
        if (some.bankName!=null&&some.branchName!=null&&some.accountNumber>0){
            this.some=some;
            isAccountCreated=true;
        }else{
            System.out.println("Please Provide Correct Information");
        }
     return  isAccountCreated;
    }

    public void getAccountInfo(){
        System.out.println("Bank Name: "+some.bankName);
        System.out.println("Branch Name: "+some.branchName);
        System.out.println("IFSC Code: "+some.ifscCode);
        System.out.println("Account Number: "+some.accountNumber);
        System.out.println("Address: "+some.address);
        System.out.println("Account Type: "+some.accountType);
    }
}
