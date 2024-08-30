package com.xworkz.test.teashop;

public class TeaShop {
    private int id;
    private String teaName;
    private double price;
    private String flavour;

    public TeaShop(){}

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }

    public String getTeaName() {
        return teaName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String getFlavour() {
        return flavour;
    }

    @Override
    public String toString() {
        return "Tea-(id="+this.id+","+"Name="+this.teaName+","+"Price="+this.price+","+"Flavour="+this.flavour+")";
    }
}
