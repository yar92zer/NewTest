package org.example.newtest.CodeRetreat.ZooOOP;

import java.util.*;

abstract class Enclosure {
    protected String type;
    protected List<Animal> animals = new ArrayList<>();

    public Enclosure(String type){this.type = type;}

    public abstract void showInfo();
}
