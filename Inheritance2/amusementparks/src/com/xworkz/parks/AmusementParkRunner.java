package com.xworkz.parks;

import com.xworkz.parks.crazywater.CrazyWaterFall;
import com.xworkz.parks.funworld.FunWorld;
import com.xworkz.parks.jrsfantacy.JRSFantacy;
import com.xworkz.parks.locobear.LocoBear;
import com.xworkz.parks.snowcity.SnowCity;
import com.xworkz.parks.wonderla.Wonderla;

public class AmusementParkRunner {
    public static void main(String[] args) {

        System.out.println("main started");
        CrazyWaterFall crazyWaterFall=new CrazyWaterFall();
        crazyWaterFall.parkspurpose();

        FunWorld funWorld=new FunWorld();
        funWorld.parkspurpose();

        JRSFantacy jrsFantacy=new JRSFantacy();
        jrsFantacy.parkspurpose();

        LocoBear locoBear=new LocoBear();
        locoBear.parkspurpose();

        SnowCity snowCity=new SnowCity();
        snowCity.parkspurpose();

        Wonderla wonderla=new Wonderla();
        wonderla.parkspurpose();

        System.out.println("main ended");
    }
}
