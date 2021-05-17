package com.ptit.abstractfactory.shipment;

public class Now implements Shipment {
    @Override
    public float getFee() {
        return (float)50;
    }
}
