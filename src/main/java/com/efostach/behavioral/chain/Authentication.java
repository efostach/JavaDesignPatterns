package com.efostach.behavioral.chain;

public class Authentication extends LoginProcess {

    public Authentication(int priority) {
        super(priority);
    }

    @Override
    public void checkPermission() {

        System.out.println("Authentication process... ");
    }
}
