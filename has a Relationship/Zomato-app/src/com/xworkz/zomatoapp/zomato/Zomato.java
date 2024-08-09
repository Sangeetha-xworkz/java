package com.xworkz.zomatoapp.zomato;

import com.xworkz.zomatoapp.food.Food;

public class Zomato {

    public  String foodName;
    Food food;

   public boolean access(Food food){
      boolean isAccessed=false;
      if (foodName=="Golden Corn Pizza"){
          System.out.println("Pizza is available...");
          if(food!=null){
              this.food=food;
              this.food.getFoodDetails();
              isAccessed=true;
              System.out.println("Order Successfully..enjoy your Pizza");
          }else System.out.println("Order Cancelled");
      }else System.out.println("the food you want is not available");
      return isAccessed;
   }
}
