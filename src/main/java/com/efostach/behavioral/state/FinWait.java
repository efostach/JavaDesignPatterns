package com.efostach.behavioral.state;

public class FinWait implements ConnectionState{
    @Override
    public void sendMessage() {
        System.out.println("FIN_WAIT state");
    }
}
