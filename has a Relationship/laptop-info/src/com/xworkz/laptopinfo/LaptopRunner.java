package com.xworkz.laptopinfo;

import com.xworkz.laptopinfo.laptop.Laptop;
import com.xworkz.laptopinfo.motherboard.MotherBoard;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop=new Laptop();
        laptop.laptopComapny="HP";

        MotherBoard motherBoard=new MotherBoard();
        motherBoard.computerBrain="CPU";
        motherBoard.dataFlowManges="Chipset";
        motherBoard.battery="CMOS";
        motherBoard.socket="Expansion slots";
        motherBoard.ports="Usb";

        laptop.allow(motherBoard);

    }
}
