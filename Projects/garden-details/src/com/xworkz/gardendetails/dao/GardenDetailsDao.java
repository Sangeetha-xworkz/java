package com.xworkz.gardendetails.dao;
import com.xworkz.gardendetails.dto.GardenDetailsDto;
public class GardenDetailsDao {
    GardenDetailsDto ref;

    public boolean addGardenDetails(GardenDetailsDto ref){
        boolean isDetailsAdded=false;
        if(ref.place!=null){
            this.ref=ref;
            isDetailsAdded=true;
        }else{
            System.out.println("Provide Place Name");
        }
        return isDetailsAdded;
    }

    public void getGardenInfo(){
        System.out.println("Id: "+ref.id);
        System.out.println("Garden Name: "+ref.name);
        System.out.println("Place: "+ref.place);
    }
}
