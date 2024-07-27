package com.xworkz.bankaccount.dto;

public class AccountDetailsDto {
    public String bankName;
    public String branchName;
    public String ifscCode;
    public long accountNumber;
    public String address;
    public String accountType;

    public AccountDetailsDto(){
        System.out.println("Fetching information about Bank Account....");
    }

}
