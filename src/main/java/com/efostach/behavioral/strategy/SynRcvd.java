package com.efostach.behavioral.strategy;

public class SynRcvd implements ConnectionState {
    @Override
    public void sendMessage() {
        System.out.println("SYN_RCVD state");
    }
}
