package com.ptit.adapterpattern;


public class DecoratorDemo {

    public static void main(String[] args) {
        UserComponent user = new UserConcreteComponent();
        user.viewItem();

        System.out.println();
        UserComponent buyer = new Buyer(user);
        buyer.action();

        System.out.println();
        UserComponent seller = new Seller(user);
        seller.action();

        System.out.println();
        UserComponent buyerAndSeller = new Seller(buyer);
        buyerAndSeller.action();
    }

}
