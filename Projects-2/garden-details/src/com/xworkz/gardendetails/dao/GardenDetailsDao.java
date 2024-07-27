package com.xworkz.gardendetails.dao;
import com.xworkz.gardendetails.dto.GardenDetailsDto;
public class GardenDetailsDao {
    GardenDetailsDto ref;

    public boolean addGardenDetails(GardenDetailsDto ref){
        boolean isDetailsAdded=false;
        boolean isIdAdded=false;
        boolean isGardenNameGiven=false;
        boolean isPlaceAdded=false;

        if(ref!=null){
            if (ref.id>0)
                isIdAdded=true;
            else System.out.println("Invalid Id");
            if (ref.name!=null)
                isGardenNameGiven=true;
            else System.out.println("Garden Name not found");

            if (ref.place!=null)
                isPlaceAdded=true;
            else System.out.println("Place Name should not be null");
        }else{
            System.out.println("Provide Correct Information");
        }
        if(isIdAdded==true&&isGardenNameGiven==true&&isPlaceAdded==true){
            this.ref=ref;
            isDetailsAdded=true;
        }
        return isDetailsAdded;
    }

    public void getGardenInfo(){
        System.out.println("Id: "+ref.id);
        System.out.println("Garden Name: "+ref.name);
        System.out.println("Place: "+ref.place);
    }
}
