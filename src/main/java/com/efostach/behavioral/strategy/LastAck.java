package com.efostach.behavioral.strategy;

public class LastAck implements ConnectionState {
    @Override
    public void sendMessage() {
        System.out.println("LAST_ACK state");
    }
}
