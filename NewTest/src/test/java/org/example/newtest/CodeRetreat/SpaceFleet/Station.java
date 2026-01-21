package org.example.newtest.CodeRetreat.SpaceFleet;

import java.util.ArrayList;
import java.util.List;

abstract class Station {
    protected String name;
    protected List<Spaceship> docked = new ArrayList<>();

    public Station(String name) {
        this.name = name;
    }

    public abstract void report();
}