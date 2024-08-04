package com.xworkz.bakeryinfo.dao;
import com.xworkz.bakeryinfo.dto.BakeryItemDto;

public class BakeryDao {
    BakeryItemDto dto;

    public void getBakeryDetails(BakeryItemDto dto){
        System.out.println("Bakery Id: "+dto.getBakeryId());
        System.out.println("Bakery Name: "+dto.getBakeryName());
        System.out.println("Bakery Owner Name: "+dto.getBakeryOwnerName());
        System.out.println("Bakery Location: "+dto.getBakeryLocation());
        System.out.println("Famous Item in that Bakery: "+dto.getFamItemName());
        System.out.println("Total Number of workers: "+dto.getNumberOfWorkers());
    }
}
