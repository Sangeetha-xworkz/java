package com.xworkz.simcard;

import com.xworkz.simcard.dao.SimCardDao;
import com.xworkz.simcard.dto.SimCardDto;

public class SimCardRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        SimCardDto ref=new SimCardDto();
        ref.id=1;
        ref.name="Artile";
        ref.plan=null;

        SimCardDao sim=new SimCardDao();
        boolean card=sim.cardValidity(ref);
        System.out.println("Card is valid: "+card);

        sim.getDetails();

        System.out.println("main ended");
    }
}
