package com.ptit.builder;

public interface UserBuilder {

    UserBuilder username(String username);
    UserBuilder password(String password);
    UserBuilder email(String email);
    UserBuilder phone(String phone);
    UserBuilder address(String address);
    UserBuilder name(String name);
    User build();

}
