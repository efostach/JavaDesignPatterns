package com.efostach.creational.factoryMethod;

class AppRunner {
    public static void main(String[] args) {
       MachineFactory machineFactory = createMachineBySpecialty("tea");
       Machine machine = machineFactory.createMachine();

       machine.makeDrink();
    }

    static MachineFactory createMachineBySpecialty(String specialty) {
        if(specialty.equalsIgnoreCase("tea")) {
            return new TeaMachineFactory();
        } else if(specialty.equalsIgnoreCase("coffee")) {
            return new CoffeMachineFactory();
        } else {
            throw new RuntimeException(specialty + " is unknown.");
        }
    }
}
