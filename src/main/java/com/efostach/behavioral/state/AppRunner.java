package com.efostach.behavioral.state;

public class AppRunner {
    public static void main(String[] args) {
        TCPConnection connection = new TCPConnection();
        ConnectionState state = new Closed();

        connection.setState(state);

        for(int i = 0; i < 10; i++) {
            connection.sentMessage();
            connection.changeState();
        }
    }
}
