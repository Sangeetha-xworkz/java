package com.xworkz.amazonapp.amazon;

import com.xworkz.amazonapp.products.Products;

public class Amazon {

    public int productId;
    public Products product;

   public boolean allow(Products product){
       boolean isAllowed=false;

       if(productId==12345){
           System.out.println("Product is available..");
           if (product!=null){
               this.product=product;
               this.product.getProductDetails();
               isAllowed=true;
               System.out.println("Product is available......take your product");
           }else System.out.println("Product is there...but not matching your request");
       }else System.out.println("the requested Product is not available");

       return isAllowed;
   }
}
