package com.efostach.behavioral.strategy;

public class Established implements ConnectionState {
    @Override
    public void sendMessage() {
        System.out.println("ESTABLISHED state");
    }
}
