package com.xworkz.passportseva.dao;

//package +class name is called full qualified class name
//FQCN=package+classname
import com.xworkz.passportseva.dto.PassPortDto;
//import is imp because we import it from other floder with in same src

public class PassPortDao {
//dao purpose is to write logics but need reference of dto

    //dto is non primitive ref we can give DTO this also
    PassPortDto dto;

    public boolean createPassPortSevaDetails(PassPortDto dto){
        System.out.println("User Passport Started");
        boolean isDAOCreated=false;
        if(null !=dto){
            this.dto=dto;
            isDAOCreated=true;
        }else {
            System.out.println("Please provide valid Sur Name");
        }
        System.out.println("User Passport ended");
          return isDAOCreated;
    }

    public void getPassPortDeatils(){
        System.out.println("get started");
        System.out.println("CPR Location: "+dto.cpvLocation);
        System.out.println("CPR DCDR Location: "+dto.dcdrLocation);
        System.out.println("Given Name: "+dto.givenName);
        System.out.println("Sur Name: "+dto.surName);
        System.out.println("Date of Birth: "+dto.dob);
        System.out.println("Email: "+dto.email);
        System.out.println("Same Mail : "+dto.isemailloginSame);
        System.out.println("Enter Password: "+dto.pwd);
        System.out.println("Confirm Password: "+dto.confirmPwd);
        System.out.println("Choose your fav Color: "+dto.hintQues);
        System.out.println("Hint ans: "+dto.hintAns);
        System.out.println("Captch is: "+dto.captch);
        System.out.println("get ended");
    }

}
