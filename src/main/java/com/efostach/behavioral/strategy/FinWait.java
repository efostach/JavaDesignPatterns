package com.efostach.behavioral.strategy;

public class FinWait implements ConnectionState {
    @Override
    public void sendMessage() {
        System.out.println("FIN_WAIT state");
    }
}
