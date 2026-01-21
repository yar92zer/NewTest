package org.example.newtest.CodeRetreat.SpaceFleet;

class Spaceship {
    private String name;
    private int crew;
    private boolean isDocked = true;
    private static int totalShips = 0;

    public Spaceship(String name, int crew) {
        this.name = name;
        this.crew = crew;
        totalShips++;
    }

    public void launch() {
        if(isDocked){
        isDocked = false;}
    }

    public void dock() {
        isDocked = true;
    }

    public String getName() {
        return name;
    }

    public static int getTotal() {
        return totalShips;
    }

    @Override
    public String toString() {
        return name + " [Экипаж: " + crew + "]" + (isDocked ? " [пристыкован]" : " [в полёте]");
    }
}