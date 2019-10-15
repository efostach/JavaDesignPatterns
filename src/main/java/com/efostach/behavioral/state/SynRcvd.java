package com.efostach.behavioral.state;

public class SynRcvd implements ConnectionState{
    @Override
    public void sendMessage() {
        System.out.println("SYN_RCVD state");
    }
}
