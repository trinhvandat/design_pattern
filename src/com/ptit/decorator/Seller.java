package com.ptit.decorator;

public class Seller extends UserDecorator {

    public Seller(UserComponent user) {
        super(user);
    }

    public void sell(String itemName){
        System.out.println(String.format("%s %s %s", "Register", itemName, "success"));
    }

    @Override
    public void action(){
        user.action();
        this.sell("Pencil");
    }
}
