package com.ptit.observer;

public class ObserverDemo {

    public static void main(String[] args) {
        UserService account1 = createUser("aaaaaa", "asdfa");
        account1.login();

        System.out.println("---");
        UserService account2 = createUser("dat", "dat");
        account2.login();
    }

    private static UserService createUser(String username, String password) {
        UserService account = new UserService(new User(username, password));
        account.attach(new Logger());
        account.attach(new Mailer());
        account.attach(new Warning());
        return account;
    }
}
