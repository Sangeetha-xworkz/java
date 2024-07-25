package com.loreal.shampoodeatils.dao;
import com.loreal.shampoodeatils.dto.ShampooDto;
public class ShampooDao {
    ShampooDto dto;

    public boolean allDetailsAdded(ShampooDto dto){
        boolean isAllDetailsAdded=false;
        if(dto.brandName!=null){
            this.dto=dto;
            isAllDetailsAdded=true;
        }else {
            System.out.println("Brand Name should be Provide");
        }
        return isAllDetailsAdded;
    }

    public void getShampooDetails(){
        System.out.println("Id: "+dto.id);
        System.out.println("Brand Name: "+dto.brandName);
        System.out.println("Quantity: "+dto.quantity);
        System.out.println("Shampoo Type: "+dto.type);
        System.out.println("Price: "+dto.price);
        System.out.println("Mgf Date: "+dto.mgfDate);
        System.out.println("exp Date: "+dto.expDate);
    }
}
