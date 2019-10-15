package com.efostach.behavioral.mediator;

public class FacebookService implements ServiceProvider {
    User user;

    FacebookService(User user) {
        this.user = user;
    }

    @Override
    public void send(String message) {
        user.getAccess(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("Facebook: " + message);
    }
}
