package com.ptit.states;

public class OrderCreated implements OrderStates {
    @Override
    public void handlerOrderStates() {
        System.out.println("order created");
    }
}
