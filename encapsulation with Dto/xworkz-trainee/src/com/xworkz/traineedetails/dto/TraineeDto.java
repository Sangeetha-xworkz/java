package com.xworkz.traineedetails.dto;

public class TraineeDto {
     private String traineeName;
     private long contactNo;
     private String email;
     private String qualification;

     public TraineeDto(){

     }

    public void setTraineeName(String traineeName) {
        this.traineeName = traineeName;
    }

    public String getTraineeName() {
        return traineeName;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }
}
