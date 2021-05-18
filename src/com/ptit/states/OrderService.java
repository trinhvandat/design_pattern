package com.ptit.states;

public class OrderService {

    private OrderStates orderStates;

    public void setOrderStates(OrderStates orderStates) {
        this.orderStates = orderStates;
    }

    public void applyOrderStates(){
        this.orderStates.handlerOrderStates();
    }
}
