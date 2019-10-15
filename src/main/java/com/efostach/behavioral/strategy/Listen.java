package com.efostach.behavioral.strategy;

public class Listen implements ConnectionState {
    @Override
    public void sendMessage() {
        System.out.println("LISTEN state");
    }
}
