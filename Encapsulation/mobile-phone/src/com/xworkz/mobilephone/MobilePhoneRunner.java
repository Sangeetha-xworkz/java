package com.xworkz.mobilephone;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import com.xworkz.mobilephone.dto.PhoneBookDTO;
import com.xworkz.mobilephone.dao.MobilePhoneDao;

public class MobilePhoneRunner {
    public static void main(String[] args) {

        PhoneBookDTO dto=new PhoneBookDTO(2,9008028126l,"Sangeetha");


        MobilePhoneDao mobilePhoneDao=new MobilePhoneDao();

        boolean ref=mobilePhoneDao.createUserInfo(dto);
        System.out.println("All Info Added: "+ref);
        mobilePhoneDao.getInfo();
    }

}
