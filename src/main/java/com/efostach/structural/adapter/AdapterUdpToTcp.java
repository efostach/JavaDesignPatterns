package com.efostach.structural.adapter;

public class AdapterUdpToTcp extends UdpProtocol implements TcpProtocol {
    @Override
    public void createTCPPackage() {
        createUDPPackage();
    }

    @Override
    public void addTCPPayload() {
        addUDPPayload();
    }

    @Override
    public void addTCPHeader() {
        addUDPHeader();
    }
}
