package com.efostach.behavioral.state;

public class Listen implements ConnectionState{
    @Override
    public void sendMessage() {
        System.out.println("LISTEN state");
    }
}
