package com.efostach.creational.singleton;

class ServerInstance {

    public static ServerInstance serverInstance;

    public synchronized ServerInstance getServerInstance() {
        if (serverInstance == null) {
            serverInstance = new ServerInstance();
        }
        return serverInstance;
    }

    private ServerInstance() {

    }
}
