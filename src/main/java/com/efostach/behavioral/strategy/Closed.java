package com.efostach.behavioral.strategy;

public class Closed implements ConnectionState {
    @Override
    public void sendMessage() {
        System.out.println("CLOSED state");
    }
}
