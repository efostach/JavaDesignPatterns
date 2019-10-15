package com.efostach.behavioral.strategy;

public class AppRunner {
    public static void main(String[] args) {
        TCPConnection connection = new TCPConnection();

        connection.setState(new Listen());
        connection.executeStrategy();

        connection.setState(new LastAck());
        connection.executeStrategy();

    }
}
