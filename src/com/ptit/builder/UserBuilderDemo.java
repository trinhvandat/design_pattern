package com.ptit.builder;

public class UserBuilderDemo {


    public static void main(String[] args) {
        User user = new UserBuilderIml()
                .username("admin")
                .password("uiop7890")
                .name("Leonard")
                .build();
        System.out.println(user.toString());
    }
}
