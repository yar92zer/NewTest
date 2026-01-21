package org.example.newtest.CodeRetreat.Game;

public class Character {
    protected String name;
    protected int health;
    private static int totalChars = 0;

    public Character(String name, int health) {
        if (name.isEmpty()) throw new IllegalArgumentException("Name empty");
        if (health <= 0) throw new IllegalStateException("Dead on start");
        this.name = name;
        this.health = health;
        totalChars++;
    }

    public void takeDamage(int dmg) {
        health -= dmg;
        if (health < 0) health = 0;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public static int getTotal() {
        return totalChars;
    }

    @Override
    public String toString() {
        return name + " [HP: " + health + "]";
    }
}