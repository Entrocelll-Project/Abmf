package com.sk.i2i.isubu.mth501.abmf;

public class UsageMessage {
    private String msisdn;
    private Long usedAmount;
    private String usedService;
    private int price;
    private int subscriberID;

    // Diğer constructor ve getter/setter metotları...

    public UsageMessage(int price, String msisdn, int subscriberID, String usedService, int par2) {
    this.msisdn = msisdn;
    this.usedAmount = (long) price; // price'ı usedAmount'a dönüştürüyoruz.
    this.usedService = usedService;
    this.price = price;
    this.subscriberID = subscriberID;
}


    public String getMsisdn() {
        return this.msisdn;
    }

    public Long getUsedAmount() {
        return this.usedAmount;
    }

    public String getUsedService() {
        return this.usedService;
    }

    public int getPrice() {
        return this.price;
    }

    public int getSubscriberID() {
        return this.subscriberID;
    }
}