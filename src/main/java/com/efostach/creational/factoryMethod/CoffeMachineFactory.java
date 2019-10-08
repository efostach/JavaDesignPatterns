package com.efostach.creational.factoryMethod;

class CoffeMachineFactory implements MachineFactory {
    @Override
    public Machine createMachine() {
        return new CoffeeMachine();
    }
}
