package com.xworkz.resortinformation;
import com.xworkz.resortinformation.dto.ResortInformationDto;
import com.xworkz.resortinformation.dao.ResortInformationDao;

public class ResortInformationRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        ResortInformationDto dto=new ResortInformationDto();
              dto.id=3;
              dto.areaInSqrt="200sqt";
              dto.propertyName="Sathvik Layout";
              dto.ownerName="Sathvik";
              dto.noOfRooms=50;

              ResortInformationDao san=new ResortInformationDao();
              boolean ref= san.resortInfoAdded(dto);
              System.out.println("All Information Added: "+ref);
              san.getInfo();


        System.out.println("main ended");
    }
}
