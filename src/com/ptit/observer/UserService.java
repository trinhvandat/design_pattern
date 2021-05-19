package com.ptit.observer;

import java.util.ArrayList;
import java.util.List;

public class UserService implements UserSubject{

    private final User user;
    private final List<UserObserver> userObservers = new ArrayList<>();

    public UserService(User user) {
        this.user = user;
    }

    @Override
    public void attach(UserObserver observer) {
        if (!userObservers.contains(observer)){
            userObservers.add(observer);
        }
    }

    @Override
    public void detach(UserObserver observer) {
        if (!userObservers.contains(observer)){
            userObservers.remove(observer);
        }
    }

    @Override
    public void notifyAllObserver() {
        for (UserObserver userObserver : userObservers){
            userObserver.update(user);
        }
    }

    public void changeStatus(String status) {
        user.setStatus(status);
        System.out.println("Status is changed");
        this.notifyAllObserver();
    }

    public void login() {

        if ((user.getUsername() != "dat") || (user.getPassword()!="dat")) {
            user.setStatus("INVALID");
        }else {
            user.setStatus("SUCCESS");
        }
        System.out.println("Login is handled");
        this.notifyAllObserver();
    }
}
