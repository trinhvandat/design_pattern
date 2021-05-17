package com.ptit.abstractfactory;

import com.ptit.abstractfactory.payment.PaymentFactory;
import com.ptit.abstractfactory.shipment.ShipmentFactory;

public class FactoryCreator {

    public static AbstractFactory getAbstractFactory(String factoryType){
        AbstractFactory abstractFactory;
        switch (factoryType){
            case "PAYMENT":{
                abstractFactory = new PaymentFactory();
                break;
            }
            case "SHIPMENT":{
                abstractFactory = new ShipmentFactory();
                break;
            }
            default:{
                throw new RuntimeException("factory type unsuported");
            }
        }
        return abstractFactory;
    }

}
