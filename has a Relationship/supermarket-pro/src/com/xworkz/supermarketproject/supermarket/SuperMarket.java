package com.xworkz.supermarketproject.supermarket;

import com.xworkz.supermarketproject.workers.Workers;

public class SuperMarket {
    public  String superMarketName;
    public Workers workers;

   public boolean allow(Workers workers){
       boolean isAllowed=false;

       if(superMarketName=="More"){
           System.out.println("Super Market Found.....you can go with further Information");
           if (workers!=null){
               this.workers=workers;
               this.workers.getWorkersDetails();
               System.out.println("Information about the Workers working in More...");
           }else System.out.println("Workers Information not found..");
       }else System.out.println("SuperMarket name not matches.....");
       return isAllowed;
   }
}
