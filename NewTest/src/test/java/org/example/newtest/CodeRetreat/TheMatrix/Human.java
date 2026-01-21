package org.example.newtest.CodeRetreat.TheMatrix;

import java.util.Objects;

class Human {
    private final String name;
    private boolean awake = false;
    private String pill = "none";

    public Human(String name) {
        this.name = name;
    }

    public void takePill(String color) throws SystemCrashException {
        if (!color.matches("red|blue")) {
            throw new SystemCrashException("INVALID PILL COLOR");
        }
        this.pill = color;
        this.awake = color.equals("red");
        System.out.println(name + " глотает " + color + " таблетку...");
        if (awake) {
            System.out.println("Глаза " + name + " открываются. Это было сон...");
        }
    }

    public boolean isAwake() {
        return awake;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human h)) return false;
        return name.equals(h.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name + (awake ? " [AWAKE]" : " [SLEEPING]");
    }
}