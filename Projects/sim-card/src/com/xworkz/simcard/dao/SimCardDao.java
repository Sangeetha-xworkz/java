package com.xworkz.simcard.dao;

import com.xworkz.simcard.dto.SimCardDto;

public class SimCardDao {
    SimCardDto ref;

    public boolean cardValidity(SimCardDto ref){
        boolean isSimcardValid=false;
      if (ref.plan!=null){
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
