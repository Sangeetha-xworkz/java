package com.xworkz.gardendetails;
import com.xworkz.gardendetails.dto.GardenDetailsDto;
import com.xworkz.gardendetails.dao.GardenDetailsDao;

public class GardenDetailsRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        GardenDetailsDto ref=new GardenDetailsDto();
         ref.id=1;
         ref.name="Lalbagh Botanical Garden";
         ref.place="Bengaluru";

         GardenDetailsDao gar=new GardenDetailsDao();
         boolean isAllAdded= gar.addGardenDetails(ref);
        System.out.println("Garden Details Added: "+isAllAdded);

        gar.getGardenInfo();
        System.out.println("main ended");
    }
}
