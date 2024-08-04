package com.xworkz.mobileshop;
import com.xworkz.mobileshop.dto.AccessoryDto;
import com.xworkz.mobileshop.dao.MobileShopDao;
public class MobileAccessoryRunner {

    public static void main(String[] args) {
        AccessoryDto dto=new AccessoryDto();
        dto.setScreenProtector("Temper Glass");
        dto.setWireLessCharger("Litvibes Wireless Charger");
        dto.setEarPhones("Apple Airpods");
        dto.setCharger("Vivo");

        MobileShopDao dao=new MobileShopDao();
        dao.getAccessoryDetails(dto);

        System.out.println("----------------------------------------------------------------");

        AccessoryDto dto1=new AccessoryDto();
        dto1.setScreenProtector("Privacy Screen protector");
        dto1.setWireLessCharger("Apple Mag Safe Charger");
        dto1.setEarPhones("Boat Neckband");
        dto1.setCharger("Sumsung");

        MobileShopDao dao1=new MobileShopDao();
        dao1.getAccessoryDetails(dto1);

    }

}
