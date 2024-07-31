package com.xworkz.mobilephone.dto;

public class PhoneBookDTO{
    private int refId;
    private long contactNo;
    private String contactName;

    //default constructor
    public PhoneBookDTO(int refId,long contactNo,String contactName){
        this.refId=refId;
        this.contactNo=contactNo;
        this.contactName=contactName;
    }

    public int getRefId(){
        return refId;
    }

    public long getContactNo(){
        return contactNo;
    }
    public String getContactName(){
        return contactName;
    }

}
