package com.xworkz.supermarketproject.workers;

public class Workers {
    public int workerId;
    public String workerSection;
    public String workingHrs;
    public double salary;

    public void getWorkersDetails(){
        System.out.println("Workers Id: "+workerId);
        System.out.println("Workers Section: "+workerSection);
        System.out.println("Working Hours: "+workingHrs);
        System.out.println("Salary: "+salary);
    }

}
