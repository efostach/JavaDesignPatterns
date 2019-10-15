package com.efostach.behavioral.state;

public class Established implements ConnectionState{
    @Override
    public void sendMessage() {
        System.out.println("ESTABLISHED state");
    }
}
