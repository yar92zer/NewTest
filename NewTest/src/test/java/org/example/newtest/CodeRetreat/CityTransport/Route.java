package org.example.newtest.CodeRetreat.CityTransport;

import java.util.ArrayList;
import java.util.List;

abstract class Route {
    protected String name;
    protected List<Vehicle> oneRoute = new ArrayList<>();

    public Route(String name) {
        this.name = name;
    }

    public abstract void showStatus();
}