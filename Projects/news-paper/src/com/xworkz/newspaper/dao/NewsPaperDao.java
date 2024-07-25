package com.xworkz.newspaper.dao;

import com.xworkz.newspaper.dto.NewsPaperDto;

public class NewsPaperDao {
    NewsPaperDto dto;
    public boolean newsPaperDetailsAdded(NewsPaperDto dto){
        boolean isAllDetailsAdded=false;
        if(dto.companyName!=null){
            this.dto=dto;
            isAllDetailsAdded=true;
        }else {
            System.out.println("Enter Company Name");
        }
        return isAllDetailsAdded;
    }

    public void getInfo(){
        System.out.println("Id: "+dto.id);
        System.out.println("Company Name: "+dto.companyName);
        System.out.println("Total Number of Pages: "+dto.noOfPages);
        System.out.println("Language: "+dto.language);
        System.out.println("Price: "+dto.price);
    }
}
