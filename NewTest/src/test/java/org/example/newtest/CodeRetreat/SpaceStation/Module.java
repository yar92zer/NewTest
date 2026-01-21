package org.example.newtest.CodeRetreat.SpaceStation;

abstract class Module {
    protected String name;

    public Module(String name) {
        this.name = name;
    }

    public abstract void activate();

    @Override
    public String toString() {
        return name;
    }
}
