package com.loreal.shampoodeatils.dao;
import com.loreal.shampoodeatils.dto.ShampooDto;
public class ShampooDao {
    ShampooDto dto;

    public boolean allDetailsAdded(ShampooDto dto){
        boolean isAllDetailsAdded=false;
        boolean isIdAdded=false;
        boolean isBrandName=false;
        boolean isQuantity=false;
        boolean isShampooType=false;
        boolean isPriceAdded=false;
        boolean isMgfDate=false;
        boolean isExpDate=false;
        if(dto!=null){
            if (dto.id>0)
                isIdAdded=true;
            else System.out.println("Id should be greater than zero");
            if (dto.brandName!=null)
                isBrandName=true;
            else System.out.println("Brand Name con't be null");
            if (dto.quantity!=null)
                isQuantity=true;
            else System.out.println("Quantity con't be null");
            if (dto.type!=null)
                isShampooType=true;
            else System.out.println("Shampoo Type con't be null");
            if (dto.price>0)
                isPriceAdded=true;
            else System.out.println("Price must be more than zero");
            if (dto.mgfDate!=null)
                isMgfDate=true;
            else System.out.println("mgf Date con't be null");
            if (dto.expDate!=null)
                isExpDate=true;
            else System.out.println("exp Date con't be null");
        }else {
            System.out.println("Invalid info.........");
        }

        if (isIdAdded==true&&isBrandName==true&&isQuantity==true&&isShampooType==true&&isPriceAdded==true&&isMgfDate==true&&isExpDate==true){
            this.dto=dto;
            isAllDetailsAdded=true;
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
