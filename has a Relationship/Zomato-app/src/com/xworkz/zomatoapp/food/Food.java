package com.xworkz.zomatoapp.food;

public class Food {
    public int id;
    public String mainIngredient;
    public  String color;
    public double price;

    public void getFoodDetails(){
        System.out.println("Id: "+id);
        System.out.println("Main Ingredient: "+mainIngredient);
        System.out.println("Color: "+color);
        System.out.println("Price: "+price);
    }
}
