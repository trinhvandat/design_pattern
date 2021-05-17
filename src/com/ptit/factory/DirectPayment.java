package com.ptit.factory;

public class DirectPayment implements Payment {

    private float total;

    public DirectPayment(float total) {
        this.total = total;
    }

    @Override
    public float getTotal() {
        return this.total;
    }
}
