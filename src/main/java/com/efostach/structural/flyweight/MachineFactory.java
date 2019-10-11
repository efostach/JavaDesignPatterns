package com.efostach.structural.flyweight;

import java.util.HashMap;

public class MachineFactory {

    private static final HashMap<String, Machine> machines = new HashMap<>();

    Machine getMachineBySpecialty(String specialty) {
        Machine machine = machines.get(specialty);
        if (machine == null) {
            if (specialty.equalsIgnoreCase("tea")) {
                machine = new TeaMachine();
            } else if (specialty.equalsIgnoreCase("coffee")) {
                machine = new CoffeeMachine();
            } else {
                throw new RuntimeException(specialty + " is unknown.");
            }
            machines.put(specialty, machine);
        }
        return machine;
    }

}
