package com.xworkz.test.hospita;

import com.xworkz.test.patient.Patient;

public class Hospital {
    public Patient patient;

    public boolean addPatient(Patient patient){
        boolean isPatientAdded=false;
        if(patient!=null){
            if(patient.name!=null){
                System.out.println("Patient is Added");
            }else System.out.println("Must provide patient name");
        }else System.out.println("Can not add Patient");
    return  isPatientAdded=true;
    }


    public void someMsg( String name,int no){
        System.out.println(no);
        System.out.println(name);
    }

    public void someMsg(int no){
        System.out.println(no);
    }
}
