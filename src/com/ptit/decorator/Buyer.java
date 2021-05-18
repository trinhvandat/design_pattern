package com.ptit.decorator;

public class Buyer extends UserDecorator {
    public Buyer(UserComponent user) {
        super(user);
    }

    public void buy(String itemName){
        System.out.println("Buy: " + itemName + " success");
    }

    @Override
    public void action(){
        user.action();
        this.buy("Pencil");
    }
}
