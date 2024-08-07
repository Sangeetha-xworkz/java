package com.xworkz.trainn;

import com.xworkz.trainn.kaviguru.KaviGaruExpress;
import com.xworkz.trainn.rajdhani.RajdhaniExpress;
import com.xworkz.trainn.shatabdi.ShatabdiExpress;
import com.xworkz.trainn.vandebharath.VandebharathExpress;
import com.xworkz.trainn.train.Train;
import com.xworkz.trainn.duronto.DurontoExpress;

public class TrainRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        DurontoExpress durontoExpress=new DurontoExpress();
        durontoExpress.purposeOfTrain();

        KaviGaruExpress kaviGaruExpress=new KaviGaruExpress();
        kaviGaruExpress.purposeOfTrain();

        RajdhaniExpress rajdhaniExpress=new RajdhaniExpress();
        rajdhaniExpress.purposeOfTrain();

        ShatabdiExpress shatabdiExpress=new ShatabdiExpress();
        shatabdiExpress.purposeOfTrain();

        //polymorphism
        System.out.println("achieving Polymorphism");
        Train train=new ShatabdiExpress();
        train.purposeOfTrain();

        System.out.println("main ended");
    }
}
