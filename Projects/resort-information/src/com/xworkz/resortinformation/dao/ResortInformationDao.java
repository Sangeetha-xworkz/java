package com.xworkz.resortinformation.dao;
import com.xworkz.resortinformation.dto.ResortInformationDto;

public class ResortInformationDao {
    ResortInformationDto dto;

    public boolean resortInfoAdded(ResortInformationDto dto){
        boolean isInfoAdded=false;
        if(dto.ownerName!=null){
            this.dto=dto;
            isInfoAdded=true;
        }else {
            System.out.println("Provide Owner Name");
        }
        return isInfoAdded;
    }

    public void getInfo(){
        System.out.println("Id: "+dto.id);
        System.out.println("Area in sqrt: "+dto.areaInSqrt);
        System.out.println("Property Name: "+dto.propertyName);
        System.out.println("Owner Name: "+dto.ownerName);
        System.out.println("Number of Rooms: "+dto.noOfRooms);
    }
}
