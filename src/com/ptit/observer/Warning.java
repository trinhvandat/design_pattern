package com.ptit.observer;

public class Warning implements UserObserver{
    @Override
    public void update(User user) {
        if (user.getStatus().equalsIgnoreCase("INVALID")){
            System.out.println("please check your account");
        }
    }
}
