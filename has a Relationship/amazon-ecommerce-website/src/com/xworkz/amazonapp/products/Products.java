package com.xworkz.amazonapp.products;

public class Products {

    public String productName;
    public String brand;
    public String color;
    public  String material;
    public double price;
    public void getProductDetails(){

        System.out.println("Product Name: "+productName);
        System.out.println("Brand Name: "+brand);
        System.out.println("Color: "+color);
        System.out.println("Material used: "+material);
        System.out.println("Price: "+price);
    }

}
