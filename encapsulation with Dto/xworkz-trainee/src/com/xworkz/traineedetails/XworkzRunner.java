package com.xworkz.traineedetails;
import com.xworkz.traineedetails.dto.TraineeDto;
import com.xworkz.traineedetails.dao.XworkzDao;

public class XworkzRunner {

    public static void main(String[] args) {
        TraineeDto dto=new TraineeDto();
        dto.setTraineeName("Sangeetha");
        dto.setContactNo(9008028126l);
        dto.setEmail("masangeeha22@gamil.com");
        dto.setQualification("BE");

        XworkzDao ref=new XworkzDao();
        ref.getTraineeDetails(dto);

        System.out.println("----------------------------------------------------");

        TraineeDto dto1=new TraineeDto();
        dto1.setTraineeName("Priya");
        dto1.setContactNo(9008028165l);
        dto1.setEmail("priyankapria22@gamil.com");
        dto1.setQualification("BE");

        XworkzDao ref1=new XworkzDao();
        ref1.getTraineeDetails(dto1);
    }
}
