package com.efostach.behavioral.mediator;

public interface ServiceProvider {

    void send(String message);

    void receive(String message);
}
