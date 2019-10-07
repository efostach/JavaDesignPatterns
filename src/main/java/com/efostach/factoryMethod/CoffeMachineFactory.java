package com.efostach.factoryMethod;

public class CoffeMachineFactory implements MachineFactory {
    @Override
    public Machine createMachine() {
        return new CoffeeMachine();
    }
}
