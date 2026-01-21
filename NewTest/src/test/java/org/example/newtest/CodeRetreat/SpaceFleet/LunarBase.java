package org.example.newtest.CodeRetreat.SpaceFleet;

class LunarBase extends Station {
    public LunarBase() {
        super("Лунная база");
    }

    @Override
    public void report() {
        System.out.println(">>> " + name + " <<<");
        docked.forEach(s -> System.out.println(" Landed: " + s));
    }

    public void dockShip(Spaceship s) {
        s.dock();
        docked.add(s);
    }
}