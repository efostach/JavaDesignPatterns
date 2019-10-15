package com.efostach.behavioral.state;

public class LastAck implements ConnectionState{
    @Override
    public void sendMessage() {
        System.out.println("LAST_ACK state");
    }
}
