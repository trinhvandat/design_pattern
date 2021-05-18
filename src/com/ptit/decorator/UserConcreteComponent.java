package com.ptit.decorator;

public class UserConcreteComponent implements UserComponent {

    @Override
    public void viewItem() {
        System.out.println("this item is pencil");
    }

    @Override
    public void action() {
        this.viewItem();
    }
}
