package com.efostach.behavioral.strategy;

public class CloseWait implements ConnectionState {
    @Override
    public void sendMessage() {
        System.out.println("CLOSE_WAIT state");
    }
}
