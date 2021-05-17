package com.ptit.abstractfactory.shipment;

import com.ptit.abstractfactory.AbstractFactory;
import com.ptit.abstractfactory.payment.Payment;
import com.ptit.abstractfactory.shipment.Exppress;
import com.ptit.abstractfactory.shipment.Now;
import com.ptit.abstractfactory.shipment.Shipment;

public class ShipmentFactory implements AbstractFactory {

    @Override
    public Payment getPayment(String paymentType, String numberBank, float total) {
        return null;
    }

    @Override
    public Shipment getShipment(String shipmentType) {
        Shipment shipment;
        switch (shipmentType){
            case "NOW": {
                shipment = new Now();
                break;
            }
            case "EXPRESS":{
                shipment = new Exppress();
                break;
            }
            default:{
                throw new RuntimeException("shipment type unsuported");
            }
        }
        return shipment;
    }
}
