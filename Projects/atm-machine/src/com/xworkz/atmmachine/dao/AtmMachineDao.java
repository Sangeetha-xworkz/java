package com.xworkz.atmmachine.dao;
import com.xworkz.atmmachine.dto.AtmMachineDto;
public class AtmMachineDao {
    AtmMachineDto dto;
    public boolean AllInfoAdded(AtmMachineDto dto){
        boolean isAllDetailsAdded=false;
        if(dto.bankName!=null&&dto.branch!=null){
            this.dto=dto;
            isAllDetailsAdded=true;
        }else{
            System.out.println("Provide Correct Information");
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
