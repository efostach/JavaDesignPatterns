package com.efostach.behavioral.strategy;

public class TCPConnection {
    ConnectionState state;

    public void setState(ConnectionState state) {
        this.state = state;
    }

    public void executeStrategy() {
        state.sendMessage();
    }
}
