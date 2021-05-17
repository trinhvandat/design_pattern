package com.ptit.factory;

public class PaymentFactory {

    private String bankNumber;
    private float total;

    public PaymentFactory(String bankNumber, float total) {
        this.bankNumber = bankNumber;
        this.total = total;
    }

    public Payment getPayment(String paymentType){
        Payment payment;
        switch (paymentType){
            case "BANKING": {
                payment = new Banking(this.bankNumber, this.total);
                break;
            }
            case "DIRECT_PAYMENT":{
                payment = new DirectPayment(this.total);
                break;
            }
            default: {
                System.out.println("The payment type unsupported.");
                payment = null;
                break;
            }
        }
        return payment;
    }

}
