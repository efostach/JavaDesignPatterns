package com.efostach.behavioral.observer;

public interface EventManager {

    void subscribe(EventListener listener);

    void unsubscribe(EventListener listener);

    void notifySubscribers();
}
