package com.xworkz.comapnyinfo;

import com.xworkz.comapnyinfo.hcltech.HclTech;
import com.xworkz.comapnyinfo.ibm.IBM;
import com.xworkz.comapnyinfo.tataconsultancy.TataConsultancyService;
import com.xworkz.comapnyinfo.tcs.TCS;
import com.xworkz.comapnyinfo.wipro.Wipro;

public class CompanyRunner {
    public static void main(String[] args) {

        System.out.println("main started");
        HclTech hclTech=new HclTech();
        hclTech.companyPurpose();

        IBM ibm=new IBM();
        ibm.companyPurpose();

        TataConsultancyService tata=new TataConsultancyService();
        tata.companyPurpose();

        TCS tcs=new TCS();
        tcs.companyPurpose();

        Wipro wipro=new Wipro();
        wipro.companyPurpose();

        System.out.println("main ended");
    }
}
