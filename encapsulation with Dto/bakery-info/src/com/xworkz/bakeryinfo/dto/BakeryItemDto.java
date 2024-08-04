package com.xworkz.bakeryinfo.dto;

public class BakeryItemDto {
   private int bakeryId;
   private String bakeryName;
   private String bakeryOwnerName;
   private String bakeryLocation;
   private String famItemName;
   private int numberOfWorkers;

   public BakeryItemDto(){

   }

   public void setBakeryId(int bakeryId) {
      this.bakeryId = bakeryId;
   }

   public int getBakeryId() {
      return bakeryId;
   }

   public void setBakeryName(String bakeryName) {
      this.bakeryName = bakeryName;
   }

   public String getBakeryName() {
      return bakeryName;
   }

   public void setBakeryOwnerName(String bakeryOwnerName) {
      this.bakeryOwnerName = bakeryOwnerName;
   }

   public String getBakeryOwnerName() {
      return bakeryOwnerName;
   }

   public void setBakeryLocation(String bakeryLocation) {
      this.bakeryLocation = bakeryLocation;
   }

   public String getBakeryLocation() {
      return bakeryLocation;
   }

   public void setFamItemName(String famItemName) {
      this.famItemName = famItemName;
   }

   public String getFamItemName() {
      return famItemName;
   }

   public void setNumberOfWorkers(int numberOfWorkers) {
      this.numberOfWorkers = numberOfWorkers;
   }

   public int getNumberOfWorkers() {
      return numberOfWorkers;
   }
}
