package com.ptit.observer;

public class Mailer implements UserObserver{
    @Override
    public void update(User user) {
        System.out.println("Send mail: login status: " + user.getStatus());
    }
}
