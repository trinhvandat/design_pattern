package com.ptit.bridge;

public class BridgeDemo {

    public static void main(String[] args) {

        final String numberBank = "q2371632232313";
        final float total = (float) 3264324;
        Payment payment = new Banking(new Paying(), numberBank, total);
        payment.pay();
    }
}
