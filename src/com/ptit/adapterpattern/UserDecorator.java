package com.ptit.adapterpattern;

public abstract class UserDecorator implements UserComponent {

    protected final UserComponent user;

    public UserDecorator(UserComponent user) {
        this.user = user;
    }

    @Override
    public void viewItem() {
        user.viewItem();
    }
}
