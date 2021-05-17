package com.ptit.builder;

public class UserBuilderIml implements  UserBuilder{

    private String username;
    private String password;
    private String name;
    private String email;
    private String address;
    private String phone;

    @Override
    public   UserBuilder username(String username) {
        this.username = username;
        return this;
    }

    @Override
    public UserBuilder password(String password) {
        this.password = password;
        return this;
    }

    @Override
    public UserBuilder email(String email) {
        this.email = email;
        return this;
    }

    @Override
    public UserBuilder phone(String phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public UserBuilder address(String address) {
        this.address = address;
        return this;
    }

    @Override
    public UserBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public User build() {
        return new User( username, password, name, email, address,phone);
    }
}
