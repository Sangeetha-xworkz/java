package com.xworkz.bankaccount.dao;
import com.xworkz.bankaccount.dto.AccountDetailsDto;

public class AccountDetailsDao {
    AccountDetailsDto some;
    public boolean createBankAccount(AccountDetailsDto some){

         boolean isAccountCreated=false;
         boolean isBankNameCorrect=false;
         boolean isBranchNameAdded=false;
         boolean isIfscCodeAdded=false;
         boolean isGivenAccNoCor=false;
         boolean isAddCorect=false;
         boolean isSavingAcc=false;
        if (some!=null){
            if (some.bankName!=null)
                isBankNameCorrect=true;
            else System.out.println("Bank Name Invalid");

            if (some.branchName!=null)
                isBranchNameAdded=true;
            else System.out.println("Branch Name invalid");

            if (some.ifscCode!=null)
                isIfscCodeAdded=true;
            else System.out.println("invalid code");

            if (some.accountNumber>0)
                isGivenAccNoCor=true;
            else System.out.println("Invalid Account Number");

            if (some.address!=null)
                isAddCorect=true;
            else System.out.println("Provide Correct Address");

            if (some.accountType!=null)
                isSavingAcc=true;
            else System.out.println("Invalid Account Type");

        }else  System.out.println("Please Provide Correct Information");

        if (isBankNameCorrect==true&&isBranchNameAdded==true&&isIfscCodeAdded==true&&isGivenAccNoCor==true&&isAddCorect==true&&isSavingAcc==true){
            this.some=some;
            isAccountCreated=true;
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
