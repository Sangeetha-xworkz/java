package com.xworkz.simcard.dao;

import com.xworkz.simcard.dto.SimCardDto;

public class SimCardDao {
    SimCardDto ref;

    public boolean cardValidity(SimCardDto ref){
        boolean isSimcardValid=false;
        boolean isIdGiven=false;
        boolean isSimName=false;
        boolean isCorrectPlan=false;
      if (ref!=null){
          if (ref.id>0)
              isIdGiven=true;
          else System.out.println("Id Con not be zero");
          if (ref.name!=null)
              isSimName=true;
          else System.out.println("Sim Name con not be null");
          if (ref.plan!=null)
              isCorrectPlan=true;
          else System.out.println("Plan should not be null");
        }else System.out.println("Data is invalid....");
      if(isIdGiven==true&&isSimName==true&&isCorrectPlan==true){
          this.ref=ref;
          isSimcardValid=true;
      }
      return isSimcardValid;
    }

    public void getDetails(){
        System.out.println("Id: "+ref.id);
        System.out.println("SimCard Name: "+ref.name);
        System.out.println("Pack Deatils: "+ref.plan);
    }
}
