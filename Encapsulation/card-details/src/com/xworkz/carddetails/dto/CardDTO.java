package com.xworkz.carddetails.dto;


public class CardDTO {
    private int cardId;
    private String cardHolderName;
    private long cardNo;
    private String expDate;
    private int cvv;
    private String cardProviderName;

    public CardDTO(){

    }

    public CardDTO(int cardId,String cardHolderName,long cardNo,String expDate,int cvv,String cardProviderName){
        this.cardId=cardId;
        this.cardHolderName=cardHolderName;
        this.cardNo=cardNo;
        this.expDate=expDate;
        this.cvv=cvv;
        this.cardProviderName=cardProviderName;
    }

    public int getCardId(){
        return cardId;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public long getCardNo() {
        return cardNo;
    }

    public String getExpDate() {
        return expDate;
    }

    public int getCvv() {
        return cvv;
    }

    public String getCardProviderName() {
        return cardProviderName;
    }

}
