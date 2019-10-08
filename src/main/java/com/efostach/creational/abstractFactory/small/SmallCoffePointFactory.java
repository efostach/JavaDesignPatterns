package com.efostach.creational.abstractFactory.small;

import com.efostach.creational.abstractFactory.CoffeeMachine;
import com.efostach.creational.abstractFactory.CoffeePointFactory;
import com.efostach.creational.abstractFactory.Cooler;
import com.efostach.creational.abstractFactory.Grinder;

public class SmallCoffePointFactory implements CoffeePointFactory {
    @Override
    public CoffeeMachine getCoffeeMachine() {
        return new SmallCoffeeMachine();
    }

    @Override
    public Cooler getCooler() {
        return new SmallCooler();
    }

    @Override
    public Grinder getGrinder() {
        return new SmallGrinder();
    }
}
