package com.xworkz.bakeryinfo;
import com.xworkz.bakeryinfo.dao.BakeryDao;
import com.xworkz.bakeryinfo.dto.BakeryItemDto;
public class BakeryRunner {
    public static void main(String[] args) {
        BakeryItemDto ref=new BakeryItemDto();
        ref.setBakeryId(1);
        ref.setBakeryName("Annapurna Bakery");
        ref.setBakeryOwnerName("Annapurna");
        ref.setBakeryLocation("Tiptur");
        ref.setFamItemName("Samosa");
        ref.setNumberOfWorkers(20);

        BakeryDao dao=new BakeryDao();
        dao.getBakeryDetails(ref);
        System.out.println("---------------------------------------------------------------------");

        BakeryItemDto ref1=new BakeryItemDto();
        ref1.setBakeryId(2);
        ref1.setBakeryName("Sai Bakery");
        ref1.setBakeryOwnerName("Sai");
        ref1.setBakeryLocation("Tiptur");
        ref1.setFamItemName("Toast");
        ref1.setNumberOfWorkers(14);

        BakeryDao dao1=new BakeryDao();
        dao1.getBakeryDetails(ref1);


    }
}
