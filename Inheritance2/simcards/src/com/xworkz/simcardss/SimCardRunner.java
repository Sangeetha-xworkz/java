package com.xworkz.simcardss;

import com.xworkz.simcardss.airtel.AirtelSimCard;
import com.xworkz.simcardss.bnsl.BnslSimCard;
import com.xworkz.simcardss.jio.JioSimCard;
import com.xworkz.simcardss.vi.ViSimCard;

public class SimCardRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        AirtelSimCard airtelSimCard=new AirtelSimCard();
        airtelSimCard.simCardPurpose();

        BnslSimCard bnslSimCard=new BnslSimCard();
        bnslSimCard.simCardPurpose();

        JioSimCard jioSimCard=new JioSimCard();
        jioSimCard.simCardPurpose();

        ViSimCard viSimCard=new ViSimCard();
        viSimCard.simCardPurpose();

        System.out.println("main ended");
    }
}
