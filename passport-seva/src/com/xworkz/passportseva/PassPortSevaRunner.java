package com.xworkz.passportseva;

import com.xworkz.passportseva.dao.PassPortDao;
import com.xworkz.passportseva.dto.PassPortDto;

public class PassPortSevaRunner {
    public static void main(String[] args) {
        System.out.println("main Started");

        PassPortDto dto=new PassPortDto();
        dto.cpvLocation="PO";
        dto.dcdrLocation=5;
        dto.givenName="Sangeetha";
        dto.surName="Arya";
        dto.dob="02/06/2002";
        dto.email="masangeetha13@gmail.com";
        dto.isemailloginSame=true;
        dto.loginId="san123";
        dto.pwd="sangu@123";
        dto.confirmPwd="sangu@123";
        dto.hintQues="Pink";
        dto.hintAns="color";
        dto.captch="Sw32H";
        //passportDao is just a ref
        //object creation
        PassPortDao  passportDao=new PassPortDao();
        //has a relationship
        boolean ref=passportDao.createPassPortSevaDetails(dto);
        System.out.println("Passport Created: "+ref);

        passportDao.getPassPortDeatils();





        System.out.println("main ended");
    }
}
