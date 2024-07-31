package com.xworkz.mobilephone.dao;
import com.xworkz.mobilephone.dto.PhoneBookDTO;

public class MobilePhoneDao {
    PhoneBookDTO dto;//dto just a ref we can give it anything

    public boolean createUserInfo(PhoneBookDTO dto){
        boolean isAllInfoAdded=false;
        boolean isRefIdAdded=false;
        boolean isContactNoAdded=false;
        boolean isContactNameAdded=false;
        if(dto!=null){
            if (dto.getRefId()>0)
                isRefIdAdded=true;
            else System.out.println("Ref Id should be more than zero");
            if (dto.getContactName()!=null)
                isContactNameAdded=true;
            else System.out.println("Contact Name Con't be null");
            if (dto.getContactNo()>0)
                isContactNoAdded=true;
            else System.out.println("Contact Number should be more than Zero");
        }
        else System.out.println("Provide Correct Information");

        if (isRefIdAdded==true&&isContactNoAdded==true&&isContactNameAdded==true){
            isAllInfoAdded=true;
            this.dto=dto;

        }
        return isAllInfoAdded;

    }

    public void getInfo(){
        System.out.println("Ref Id: "+dto.getRefId());
        System.out.println("Contact Number: "+dto.getContactNo());
        System.out.println("Contact Name: "+dto.getContactName());
    }
}
