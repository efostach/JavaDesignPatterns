package com.efostach.structural.flyweight;

class CoffeeMachine implements Machine {

    @Override
    public void makeDrink() {
        System.out.println("Making Coffee...");
    }
}
