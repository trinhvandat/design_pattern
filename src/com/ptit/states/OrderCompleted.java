package com.ptit.states;

public class OrderCompleted implements OrderStates {
    @Override
    public void handlerOrderStates() {
        System.out.println("Order completed");
    }
}
