package com.ptit.bridge;

public abstract class Payment {

    protected PaymentAPI paymentAPI;

    public Payment(PaymentAPI paymentAPI) {
        this.paymentAPI = paymentAPI;
    }

    public abstract void pay();
}
