package com.xworkz.hospitalpatient.dao;
import com.xworkz.hospitalpatient.dto.PatientDto;

public class HospitalDao {
    PatientDto dto;

   public void  getPatientDetails(PatientDto dto){
       System.out.println("Patient Id: "+dto.getPatientId());
       System.out.println("Patient Name: "+dto.getPatientName());
       System.out.println("Patient dob: "+dto.getPatientDob());
       System.out.println("Patient Age: "+dto.getPatientAge());
       System.out.println("Patient Address: "+dto.getPatientAddress());
       System.out.println("Admitted date: "+dto.getPatientAdmitDate());
       System.out.println("Discharged Date: "+dto.getPatientDischargeDate());
   }
}
