package com.efostach.behavioral.observer;

public class Parents implements EventListener{
    String name;

    public Parents(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(int balance) {
        System.out.println("Parents informed. Child balance is " + balance);
    }
}
