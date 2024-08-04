package com.xworkz.traineedetails.dao;
import com.xworkz.traineedetails.dto.TraineeDto;

public class XworkzDao {
     TraineeDto dto;

     public void getTraineeDetails(TraineeDto dto){
         System.out.println("Trainee Name: "+dto.getTraineeName());
         System.out.println("Contact Number: "+dto.getContactNo());
         System.out.println("email: "+dto.getEmail());
         System.out.println("Qualification: "+dto.getQualification());
     }
}
