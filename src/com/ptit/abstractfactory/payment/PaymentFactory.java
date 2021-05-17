package com.ptit.abstractfactory.payment;

import com.ptit.abstractfactory.*;
import com.ptit.abstractfactory.shipment.Shipment;

public class PaymentFactory implements AbstractFactory {

    @Override
    public Payment getPayment(String paymentType, String bankNumber, float total) {
        Payment payment;
        switch (paymentType){
            case "BANKING": {
                payment = new Banking(bankNumber, total);
                break;
            }
            case "DIRECT_PAYMENT":{
                payment = new DirectPayment(total);
                break;
            }
            default: {
                throw new RuntimeException("Payment type unsupported");
            }
        }
        return payment;
    }

    @Override
    public Shipment getShipment(String shipmentType) {
        return null;
    }
}
