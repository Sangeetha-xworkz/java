package com.loreal.shampoodeatils;
import com.loreal.shampoodeatils.dto.ShampooDto;
import  com.loreal.shampoodeatils.dao.ShampooDao;

public class ShampooRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        ShampooDto dto=new ShampooDto();
          dto.id=1234;
          dto.brandName="L'oreal";
          dto.quantity=null;
          dto.type="Smooth and Silky";
          dto.price=780.00;
          dto.mgfDate="23/07/2022";
          dto.expDate="02/09/2024";

        ShampooDao ref=new ShampooDao();
        boolean isDetailsAdded= ref.allDetailsAdded(dto);
        System.out.println("All the Details are Added: "+isDetailsAdded);

        ref.getShampooDetails();
        System.out.println("main ended");

    }
}
