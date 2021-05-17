package com.ptit.abstractfactory.shipment;

public class Exppress implements Shipment {
    @Override
    public float getFee() {
        return (float) 100;
    }
}
