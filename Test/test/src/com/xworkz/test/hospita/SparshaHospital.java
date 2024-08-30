package com.xworkz.test.hospita;

import com.xworkz.test.patient.Patient;

public class SparshaHospital extends Hospital{

    public int fees;

    @Override
    public boolean addPatient(Patient patient) {
        boolean isPatientAdded = false;
        if (fees==10000)
            isPatientAdded = super.addPatient(patient);
        else System.out.println("Please pay the fees");
        return isPatientAdded;
    }
}
