package org.example.newtest.CodeRetreat.SpaceStation;

class Astronaut {
    private String name;
    private int oxygenLevel;
    private static int total = 0;

    public Astronaut(String name, int oxygenLevel) {
        this.name = name;
        this.oxygenLevel = oxygenLevel;
        total++;
    }

    public void consumeOxygen() {
        oxygenLevel -= 10;
    }

    public static int getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return name + " [02: " + oxygenLevel + "]";
    }
}