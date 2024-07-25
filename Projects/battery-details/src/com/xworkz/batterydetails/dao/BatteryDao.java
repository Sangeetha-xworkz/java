package com.xworkz.batterydetails.dao;
import com.xworkz.batterydetails.dto.BatteryDto;

public class BatteryDao {
    BatteryDto ref;

    public boolean batteryDetailsAdded(BatteryDto ref){
        boolean isDetailsAdded=false;
        if(ref.name!=null){
            this.ref=ref;
            isDetailsAdded=true;
        }else {
            System.out.println("Please Provide Battery name");
        }
        return isDetailsAdded;
    }

    public void getDetails(){
        System.out.println("Id: "+ref.id);
        System.out.println("Battery Name: "+ref.name);
        System.out.println("Battery Weight: "+ref.weight);
    }
}
