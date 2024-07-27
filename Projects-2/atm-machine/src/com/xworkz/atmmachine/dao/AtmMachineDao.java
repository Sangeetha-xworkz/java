package com.xworkz.atmmachine.dao;
import com.xworkz.atmmachine.dto.AtmMachineDto;

import java.util.Objects;

public class AtmMachineDao {
    AtmMachineDto dto;
    public boolean AllInfoAdded(AtmMachineDto dto){
        boolean isAllDetailsAdded=false;
        boolean isId=false;
        boolean isBankName=false;
        boolean isBranch=false;
        boolean isTypeOfAtm=false;
        boolean isChecksBalance=false;
        if(dto!=null){
            if (dto.id>0)
                isId=true;
            else System.out.println("Id can not be zero");
            if (dto.bankName!=null)
                isBankName=true;
            else System.out.println("Bank Name con't be null");
            if (dto.branch!=null)
                isBranch=true;
            else System.out.println("Branch con't be null");
            if (dto.typeOfAtm!=null)
                isTypeOfAtm=true;
            else System.out.println("Type of Atm con't be null");
            if (dto.checkBalance>0)
                isChecksBalance=true;
            else System.out.println("Balance must be more than zero");

        }else{
            System.out.println("Invalid data.......");
        }
        if (isId==true&&isBankName==true&&isBranch==true&&isTypeOfAtm==true&&isChecksBalance==true){
            this.dto=dto;
            isAllDetailsAdded=true;
        }
        return isAllDetailsAdded;
    }

    public void getAtmDetails(){
        System.out.println("Id: "+dto.id);
        System.out.println("Bank Name: "+dto.bankName);
        System.out.println("Bank Branch: "+dto.branch);
        System.out.println("Atm Type: "+dto.typeOfAtm);
        System.out.println("Check Balance: "+dto.checkBalance);
    }


}
