package com.xworkz.mobileshop.dto;

public class AccessoryDto {
    private  String screenProtector;
    private String wireLessCharger;
    private String earPhones;
    private String charger;

    public AccessoryDto(){

    }

   public void setScreenProtector(String screenProtector){
        this.screenProtector=screenProtector;
   }

   public String getScreenProtector(){
        return screenProtector;
   }

    public void setWireLessCharger(String wireLessCharger) {
        this.wireLessCharger = wireLessCharger;
    }

    public String getWireLessCharger() {
        return wireLessCharger;
    }

    public void setEarPhones(String earPhones) {
        this.earPhones = earPhones;
    }

    public String getEarPhones() {
        return earPhones;
    }

    public void setCharger(String charger) {
        this.charger = charger;
    }

    public String getCharger() {
        return charger;
    }
}
