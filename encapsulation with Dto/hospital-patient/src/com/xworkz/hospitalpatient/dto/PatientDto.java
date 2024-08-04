package com.xworkz.hospitalpatient.dto;

public class PatientDto {
    private int patientId;
    private String patientName;
    private String patientDob;
    private int patientAge;
    private String patientAddress;
    private String patientAdmitDate;
    private String patientDischargeDate;

    public PatientDto(){

    }

    public void setPatientId(int patientId){
        this.patientId=patientId;
    }

    public int getPatientId(){
        return patientId;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientDob(String patientDob) {
        this.patientDob = patientDob;
    }

    public String getPatientDob() {
        return patientDob;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAdmitDate(String patientAdmitDate) {
        this.patientAdmitDate = patientAdmitDate;
    }

    public String getPatientAdmitDate() {
        return patientAdmitDate;
    }

    public void setPatientDischargeDate(String patientDischargeDate) {
        this.patientDischargeDate = patientDischargeDate;
    }

    public String getPatientDischargeDate() {
        return patientDischargeDate;
    }
}
