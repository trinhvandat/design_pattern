package com.ptit.adapter;

public class PaymentProcessing implements Payment {

    private final Momo momo;

    public PaymentProcessing(Momo momo) {
        this.momo = momo;
    }

    @Override
    public void pay(float total) {
        System.out.println("start payment");
        this.momo.pay(total);
    }
}
