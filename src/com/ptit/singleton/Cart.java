package com.ptit.singleton;

public class Cart {

    private static Cart INSTANCE = new Cart();

    private Cart() {}

    public static Cart getInstance(){
        return INSTANCE;
    }

    public void createCart(){
        System.out.println("create success");
    }
}
