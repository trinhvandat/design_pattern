package com.ptit.bridge;

public class DirectPayment extends Payment {

    private float total;

    public DirectPayment(PaymentAPI paymentAPI, float total) {
        super(paymentAPI);
        this.total = total;
    }

    @Override
    public void pay() {
        System.out.println("start direct payment");
        paymentAPI.pay(this.total);
    }
}
