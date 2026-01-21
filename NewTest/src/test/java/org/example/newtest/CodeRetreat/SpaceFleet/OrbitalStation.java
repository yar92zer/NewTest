package org.example.newtest.CodeRetreat.SpaceFleet;

class OrbitalStation extends Station {
    public OrbitalStation() {
        super("Орбитальная станция");
    }

    @Override
    public void report() {
        System.out.println("=== " + name + " ===");
        docked.forEach(s -> System.out.println("  Docked: " + s));
    }

    public void dockShip(Spaceship s) {
        s.dock();
        docked.add(s);
    }
}