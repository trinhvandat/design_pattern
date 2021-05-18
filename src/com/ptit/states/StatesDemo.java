package com.ptit.states;

public class StatesDemo {

    public static void main(String[] args) {
        OrderService orderService = new OrderService();

        orderService.setOrderStates(new OrderCreated());
        orderService.applyOrderStates();

        orderService.setOrderStates(new OrderCompleted());
        orderService.applyOrderStates();
    }

}
