package com.xworkz.batterydetails;

import com.xworkz.batterydetails.dao.BatteryDao;
import com.xworkz.batterydetails.dto.BatteryDto;

    public class BatteryRunner {
        public static void main(String[] args) {
            System.out.println("main started");

            BatteryDto ref=new BatteryDto();
            ref.id=1;
            ref.name="Panasonic";
            ref.weight="40kw";

            BatteryDao bat=new BatteryDao();
            boolean batt= bat.batteryDetailsAdded(ref);
            System.out.println("All the Details are Added: "+ref);
            bat.getDetails();


        }
    }


