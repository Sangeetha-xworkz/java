package com.xworkz.mobileshop.dao;
import com.xworkz.mobileshop.dto.AccessoryDto;

public class MobileShopDao {

    AccessoryDto dto;

    public void getAccessoryDetails(AccessoryDto dto){
        System.out.println("Screen Protector Company Name: "+dto.getScreenProtector());
        System.out.println("Wireless Charger Name: "+dto.getWireLessCharger());
        System.out.println("EarPhone Company Name: "+dto.getEarPhones());
        System.out.println("Charger Company Name: "+dto.getCharger());
    }
}
