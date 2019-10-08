package com.efostach.creational.abstractFactory;

public interface CoffeePointFactory {
    CoffeeMachine getCoffeeMachine();
    Cooler getCooler();
    Grinder getGrinder();
}
