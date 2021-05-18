package com.ptit.singleton;

public class SingletonDemo {

    public static void main(String[] args) {

        Cart cart = Cart.getInstance();
        cart.createCart();

    }
}
