package com.xworkz.carddetails.dao;

import com.xworkz.carddetails.dto.CardDTO;

public class CardDao {
    CardDTO dto;

    public boolean addCardDetails(CardDTO dto) {
        boolean isAllDetailsAdded = false;
        boolean isIdAdded = false;
        boolean isCardHolderName = false;
        //boolean isCardNo=false;
        boolean isExpDate = false;
        boolean isCvv = false;
        boolean isCardProviderName = false;
        boolean isCardNo = false;
        if (dto != null) {
            if (dto.getCardId() > 0) {
                isIdAdded = true;
            } else {
                System.out.println("Id should be more than zero");
            }
            if (dto.getCardHolderName() != null) {
                isCardHolderName = true;
            } else {
                System.out.println("Name con't be null");
            }
            if (dto.getCardNo() > 0) {
                isCardNo = true;
            } else {
                System.out.println("Card No should more than zero");
            }
            if (dto.getExpDate() != null) {
                isExpDate = true;
            } else {
                System.out.println("Exp Date con't be null");
            }
            if (dto.getCvv() > 0) {
                isCvv = true;
            } else {
                System.out.println("Cvv Should be more than Zero");
            }
            if (dto.getCardProviderName() != null) {
                isCardProviderName = true;
            } else {
                System.out.println("Card Provider Name con't be null");
            }
        } else {
            System.out.println("Provide Correct Information");
        }
        if (isIdAdded == true && isCardHolderName == true && isCardNo == true && isCvv == true && isExpDate == true && isCardProviderName == true) {
            isAllDetailsAdded = true;
           this.dto=dto;

        }
        return isAllDetailsAdded;
    }

    public void getInfo() {
        System.out.println("Card Id: " + dto.getCardId());
        System.out.println("Card Holder: " + dto.getCardHolderName());
        System.out.println("Card No: " + dto.getCardNo());
        System.out.println("Exp Date: " + dto.getExpDate());
        System.out.println("CVV: " + dto.getCvv());
        System.out.println("Card Provider Name: " + dto.getCardProviderName());

        }
    }


