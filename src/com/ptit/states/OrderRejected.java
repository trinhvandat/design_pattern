package com.ptit.states;

public class OrderRejected implements OrderStates {
    @Override
    public void handlerOrderStates() {
        System.out.println("order rejected");
    }
}
