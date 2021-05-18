package com.ptit.bridge;

public class Banking extends Payment {

    private String bankNumber;
    private float total;

    public Banking(PaymentAPI paymentAPI, String bankNumber, float total) {
        super(paymentAPI);
        this.bankNumber = bankNumber;
        this.total = total;
    }

    @Override
    public void pay() {
        System.out.println("Start pay");
        paymentAPI.pay(this.total);
    }
}
