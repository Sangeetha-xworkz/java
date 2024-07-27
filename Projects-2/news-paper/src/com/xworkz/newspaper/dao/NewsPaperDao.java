package com.xworkz.newspaper.dao;

import com.xworkz.newspaper.dto.NewsPaperDto;

public class NewsPaperDao {
    NewsPaperDto dto;
    public boolean newsPaperDetailsAdded(NewsPaperDto dto){
        boolean isAllDetailsAdded=false;
        boolean isIdAdded=false;
        boolean isCompanyName=false;
        boolean isNoOfPages=false;
        boolean isWhichLang=false;
        boolean isPriceAdded=false;
        if(dto!=null){
            if (dto.id>0)
                isIdAdded=true;
            else System.out.println("Id con't be zero");
            if (dto.companyName!=null)
                isCompanyName=true;
            else System.out.println("Company Name con't be null");
            if (dto.noOfPages>0)
                isNoOfPages=true;
            else System.out.println("Number of Pages con't be zero");
            if (dto.language!=null)
                isWhichLang=true;
            else System.out.println("Language con't be null");
            if (dto.price>0)
                isPriceAdded=true;
            else System.out.println("Price must be more than zero");

        }else {
            System.out.println("Invalid data...");
        }
        if (isIdAdded==true&&isCompanyName==true&&isNoOfPages==true&&isWhichLang==true&&isPriceAdded==true){
            this.dto=dto;
            isAllDetailsAdded=true;
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
