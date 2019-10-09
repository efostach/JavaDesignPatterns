package com.efostach.structural.adapter;

public class ProtocolRunner {
    public static void main(String[] args) {

        TcpProtocol data = new AdapterUdpToTcp();

        data.addTCPHeader();
        data.addTCPPayload();
        data.createTCPPackage();

    }
}
