package com.ptit.abstractfactory.payment;

import com.ptit.abstractfactory.payment.Payment;

public class Banking implements Payment {

    private String bankNumber;
    private float total;

    public Banking(String bankNumber, float total) {
        this.bankNumber = bankNumber;
        this.total = total;
    }

    @Override
    public float getTotal() {
        return this.total;
    }
}
