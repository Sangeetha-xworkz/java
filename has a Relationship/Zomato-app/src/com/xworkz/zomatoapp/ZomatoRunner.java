package com.xworkz.zomatoapp;

import com.xworkz.zomatoapp.food.Food;
import com.xworkz.zomatoapp.zomato.Zomato;

public class ZomatoRunner {
    public static void main(String[] args) {
        Zomato zomato=new Zomato();
        zomato.foodName="Golden Corn Pizza";

        Food food=new Food();
        food.id=123;
        food.mainIngredient="Corn";
        food.color="Gold";
        food.price=159.99;

        zomato.access(food);
    }
}
