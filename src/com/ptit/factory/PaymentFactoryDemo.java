package com.ptit.factory;

public class PaymentFactoryDemo {

    public static void main(String[] args) {
        PaymentFactory paymentFactory = new PaymentFactory("123425243423", (float)50);
        Payment payment = paymentFactory.getPayment("BANKING");
        System.out.println(payment.getTotal());
    }
}
