package com.xworkz.laptopinfo.laptop;

import com.xworkz.laptopinfo.motherboard.MotherBoard;

public class Laptop {

    public String laptopComapny="HP";
    public MotherBoard ref;

    public boolean allow(MotherBoard ref){
        boolean isAllowed=false;
        if(laptopComapny=="HP"){
            System.out.println("Laptop Name matches....Know about motherboard");
            if(ref!=null){
                this.ref=ref;
                this.ref.getMotherBoardDetails();
                System.out.println();
                isAllowed=true;
                System.out.println("This is the information about MotherBoard...");
            }else System.out.println("MotherBoard Information not found...");
        }else System.out.println("Laptop Name not found..Please provide required name");
        return isAllowed;
    }
}
