package com.ptit.observer;

public class Logger implements UserObserver{
    @Override
    public void update(User user) {
        if (user.getStatus().equalsIgnoreCase("INVALID")){
            System.out.println("login fail");
        }
        else {
            System.out.println("login sucees");
        }
    }
}
