package com.xworkz.atmmachine;
import com.xworkz.atmmachine.dto.AtmMachineDto;
import com.xworkz.atmmachine.dao.AtmMachineDao;

public class AtmMachineRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        AtmMachineDto dto=new AtmMachineDto();
        dto.id=1;
        dto.bankName="SBI";
        dto.branch="Hassan Circle Tiptur";
        dto.typeOfAtm="Bulk";
        dto.checkBalance=5000.00;

        AtmMachineDao acc=new AtmMachineDao();
        boolean ref= acc.AllInfoAdded(dto);
        System.out.println("All Information Added: "+ref);
        acc.getAtmDetails();
    }
}
