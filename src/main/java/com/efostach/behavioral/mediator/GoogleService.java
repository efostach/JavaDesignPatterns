package com.efostach.behavioral.mediator;

public class GoogleService implements ServiceProvider{
    User user;

    GoogleService(User user) {
        this.user = user;
    }

    @Override
    public void send(String status) {
        user.getAccess(status, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("Google: " + message);
    }
}
