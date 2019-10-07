package com.efostach.factoryMethod;

public class TeaMachineFactory implements MachineFactory {
    @Override
    public Machine createMachine() {
        return new TeaMachine();
    }
}
