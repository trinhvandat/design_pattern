package com.ptit.abstractfactory;

import com.ptit.abstractfactory.payment.Payment;
import com.ptit.abstractfactory.shipment.Shipment;

public interface AbstractFactory {

    Payment getPayment(String paymentType, String numberBank, float total);
    Shipment getShipment(String shipmentType);
}
