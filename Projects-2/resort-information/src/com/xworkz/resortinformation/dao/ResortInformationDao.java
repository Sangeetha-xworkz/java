package com.xworkz.resortinformation.dao;
import com.xworkz.resortinformation.dto.ResortInformationDto;

public class ResortInformationDao {
    ResortInformationDto dto;

    public boolean resortInfoAdded(ResortInformationDto dto){
        boolean isInfoAdded=false;
        boolean isIdAdded=false;
        boolean isAreaAdded=false;
        boolean isPropertyNameRight=false;
        boolean isOwnerName=false;
        boolean isTotalNoofRooms=false;
        if(dto!=null){
            if (dto.id>0)
                isIdAdded=true;
            else System.out.println("Invalid Id");

            if (dto.areaInSqrt!=null)
                isAreaAdded=true;
            else System.out.println("Provide Area in sqrt");

            if (dto.propertyName!=null)
                isPropertyNameRight=true;
            else System.out.println("Provide Property name");

            if (dto.ownerName!=null)
                isOwnerName=true;
            else System.out.println("Not a owner Name");

            if (dto.noOfRooms>0)
                isTotalNoofRooms=true;
            else System.out.println("Provide Number of Rooms");

        }else {
            System.out.println("Provided data is Invalid..");
        }

        if (isIdAdded==true&&isAreaAdded==true&&isPropertyNameRight==true&&isOwnerName==true&&isTotalNoofRooms==true) {
            this.dto = dto;
            isInfoAdded = true;
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
