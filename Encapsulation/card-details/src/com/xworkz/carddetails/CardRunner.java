package com.xworkz.carddetails;

import com.xworkz.carddetails.dao.CardDao;
import com.xworkz.carddetails.dto.CardDTO;

public class CardRunner {
    public static void main(String[] args) {
        CardDTO dto=new CardDTO(67,"Sangeetha",1237887664244l,"22/09/2024",123,"Manager");

        CardDao ref=new CardDao();
        boolean isAllAdded= ref.addCardDetails(dto);
        System.out.println("All Data Added: "+isAllAdded);
        ref.getInfo();

    }
}
