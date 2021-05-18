package com.ptit.adapter;

public class AdapterDemo {

    public static void main(String[] args) {
        Payment payment = new PaymentProcessing(new Momo());

        final float total = (float) 231;
        payment.pay(total);
    }
}
