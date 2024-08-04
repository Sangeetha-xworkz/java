package com.xworkz.hospitalpatient;
import com.xworkz.hospitalpatient.dto.PatientDto;
import com.xworkz.hospitalpatient.dao.HospitalDao;

public class HospitalRunner {

    public static void main(String[] args) {
        PatientDto dto=new PatientDto();
        dto.setPatientId(1);
        dto.setPatientName("Baba");
        dto.setPatientDob("03/06/2002");
        dto.setPatientAge(22);
        dto.setPatientAddress("Bengaluru");
        dto.setPatientAdmitDate("22/07/2024");
        dto.setPatientDischargeDate("28/07/2024");

        HospitalDao dao=new HospitalDao();
        dao.getPatientDetails(dto);

        System.out.println("----------------------------------------------------------");

        PatientDto dto1=new PatientDto();
        dto1.setPatientId(2);
        dto1.setPatientName("Rama");
        dto1.setPatientDob("02/06/2001");
        dto1.setPatientAge(23);
        dto1.setPatientAddress("Tumkur");
        dto1.setPatientAdmitDate("20/09/2024");
        dto1.setPatientDischargeDate("28/09/2024");

        HospitalDao dao1=new HospitalDao();
        dao1.getPatientDetails(dto1);
    }
}
