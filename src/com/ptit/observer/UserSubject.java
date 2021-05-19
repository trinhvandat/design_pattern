package com.ptit.observer;

public interface UserSubject {
    void attach(UserObserver observer);

    void detach(UserObserver observer);

    void notifyAllObserver();
}
