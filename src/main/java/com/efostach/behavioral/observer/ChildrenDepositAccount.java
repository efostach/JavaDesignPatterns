package com.efostach.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ChildrenDepositAccount implements EventManager{
    private int balance;

    List<EventListener> subscribers = new ArrayList<>();

    public void updateBalance(int balance) {
        this.balance = balance;
        notifySubscribers();
    }

    public void freezeBalance() {
        notifySubscribers();
    }

    @Override
    public void subscribe(EventListener listener) {
        subscribers.add(listener);
    }

    @Override
    public void unsubscribe(EventListener listener) {
        subscribers.remove(listener);
    }

    @Override
    public void notifySubscribers() {
        for(EventListener listener : subscribers) {
            listener.handleEvent(balance);
        }
    }
}
