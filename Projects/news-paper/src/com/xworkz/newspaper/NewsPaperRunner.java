package com.xworkz.newspaper;

import com.xworkz.newspaper.dto.NewsPaperDto;
import com.xworkz.newspaper.dao.NewsPaperDao;

public class NewsPaperRunner {
    public static void main(String[] args) {
        System.out.println("main started");
         NewsPaperDto dto=new NewsPaperDto();
                dto.id=1;
                dto.companyName="Times of India";
                dto.noOfPages=9;
                dto.language="English";
                dto.price=15.00;

         NewsPaperDao news=new NewsPaperDao();
         boolean ref=news.newsPaperDetailsAdded(dto);
        System.out.println("All Details are Added: "+ref);

        news.getInfo();

        System.out.println("main ended");
    }
}
