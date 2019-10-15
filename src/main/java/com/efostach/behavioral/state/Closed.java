package com.efostach.behavioral.state;

public class Closed implements ConnectionState{
    @Override
    public void sendMessage() {
        System.out.println("CLOSED state");
    }
}
