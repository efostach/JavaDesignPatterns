package com.efostach.creational.factoryMethod;

class TeaMachineFactory implements MachineFactory {
    @Override
    public Machine createMachine() {
        return new TeaMachine();
    }
}
