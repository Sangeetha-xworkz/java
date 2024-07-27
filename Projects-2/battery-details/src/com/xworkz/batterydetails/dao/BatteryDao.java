package com.xworkz.batterydetails.dao;
import com.xworkz.batterydetails.dto.BatteryDto;

public class BatteryDao {
    BatteryDto ref;

    public boolean batteryDetailsAdded(BatteryDto ref){
        boolean isDetailsAdded=false;
        boolean isIdGiven=false;
        boolean isNameOfTheBattery=false;
        boolean isWeight=false;
        if(ref!=null){
            if (ref.id>0)
                isIdGiven=true;
            else System.out.println("Id can not be zero");
            if (ref.name!=null)
                isNameOfTheBattery=true;
            else System.out.println("battery Name should not be null");
            if (ref.weight!=null)
                isWeight=true;
            else System.out.println("Weight con't be null");
        }else {
            System.out.println("Invalid data...");
        }
        if(isIdGiven==true&&isNameOfTheBattery==true&&isWeight==true){
            this.ref=ref;
            isDetailsAdded=true;
        }
        return isDetailsAdded;
    }

    public void getDetails(){
        System.out.println("Id: "+ref.id);
        System.out.println("Battery Name: "+ref.name);
        System.out.println("Battery Weight: "+ref.weight);
    }
}
