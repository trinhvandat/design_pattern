package com.ptit.abstractfactory;

import com.ptit.abstractfactory.payment.Payment;

public class AbstractFactoryDemo {

    public static void main(String[] args) {
        AbstractFactory abstractFactory = FactoryCreator.getAbstractFactory("PAYMENT");
        Payment payment =abstractFactory.getPayment("BANKING", "124562613", (float) 2839);
        System.out.println(payment.getTotal());
    }
}
