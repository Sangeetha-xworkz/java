package com.xworkz.amazonapp;

import com.xworkz.amazonapp.amazon.Amazon;
import com.xworkz.amazonapp.products.Products;

public class AmazonRunner {
    public static void main(String[] args) {
        Amazon ref=new Amazon();
        ref.productId=12345;

        Products products=new Products();
        products.productName="Junior Ring";
        products.brand="TOYZ TREND";
        products.color="Multi Color";
        products.material="Plastic";
        products.price=259.99;

        ref.allow(products);
    }
}
