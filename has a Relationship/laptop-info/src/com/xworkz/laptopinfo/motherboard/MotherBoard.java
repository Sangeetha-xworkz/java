package com.xworkz.laptopinfo.motherboard;

public class MotherBoard {
    public String computerBrain;//cpu
    public String dataFlowManges;//chipset data flow between ram and cpu and other peripheral device is managed by chipset
    public String battery;//CMOS helps the BIOS OR UEFI to store the hardware configuration settings
    public String socket;//expansion slots  allows users to add additional components to system
    public String ports;//Usb usually placed on the surface of the motherboard

    public void getMotherBoardDetails(){
        System.out.println(computerBrain+":Brain of MotherBoard.");
        System.out.println(dataFlowManges+":Manages the Data flow between CPU,RAM and other Peripheral device.");
        System.out.println(battery+" :helps the BIOS or UEFI store the hardware configuration settings. ");
        System.out.println(socket+":allows Users to add additional components to Systems");
        System.out.println(ports+":usually placed on the surface of the MotherBoard");
    }
}
