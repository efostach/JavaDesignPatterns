package com.efostach.behavioral.chain;

public class Authorization extends LoginProcess {

    public Authorization(int priority) {
        super(priority);
    }

    @Override
    public void checkPermission() {

        System.out.println("Authorization process... ");
    }
}
