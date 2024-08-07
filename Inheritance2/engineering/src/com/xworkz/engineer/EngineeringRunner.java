package com.xworkz.engineer;

import com.xworkz.engineer.aie.ArtificialIntelligenceEngg;
import com.xworkz.engineer.civilengg.CivilEngg;
import com.xworkz.engineer.cse.ComputerScienceEngg;
import com.xworkz.engineer.ece.ElectricalAndCommunicationEngg;
import com.xworkz.engineer.eee.ElectricEngg;
import com.xworkz.engineer.ise.InformationScienceEngg;
import com.xworkz.engineer.me.MechanicalEngg;

public class EngineeringRunner {
    public static void main(String[] args) {

        System.out.println("main started");
        ArtificialIntelligenceEngg ref=new ArtificialIntelligenceEngg();
        ref.purposeOfEngineers();

        CivilEngg civilEngg=new CivilEngg();
        civilEngg.purposeOfEngineers();

        ComputerScienceEngg computerScienceEngg=new ComputerScienceEngg();
        computerScienceEngg.purposeOfEngineers();

        ElectricalAndCommunicationEngg ele=new ElectricalAndCommunicationEngg();
        ele.purposeOfEngineers();

        ElectricEngg electricEngg=new ElectricEngg();
        electricEngg.purposeOfEngineers();

        InformationScienceEngg info=new InformationScienceEngg();
        info.purposeOfEngineers();

        MechanicalEngg mechanicalEngg=new MechanicalEngg();
        mechanicalEngg.purposeOfEngineers();

        System.out.println("main ended");
    }
}
