package com.efostach.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ShopRunner {
    public static void main(String[] args) {
        MachineFactory factory = new MachineFactory();
        List<Machine> machines = new ArrayList<>();
        machines.add(factory.getMachineBySpecialty("tea"));
        machines.add(factory.getMachineBySpecialty("tea"));
        machines.add(factory.getMachineBySpecialty("tea"));
        machines.add(factory.getMachineBySpecialty("tea"));
        machines.add(factory.getMachineBySpecialty("coffee"));

        for (Machine machine : machines) {
            machine.makeDrink();
        }
    }
}
