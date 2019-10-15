package com.efostach.behavioral.strategy;

public class SynSent implements ConnectionState {
    @Override
    public void sendMessage() {
        System.out.println("SYN_SENT state");
    }
}
