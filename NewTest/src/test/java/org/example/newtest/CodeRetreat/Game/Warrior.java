package org.example.newtest.CodeRetreat.Game;

class Warrior extends Character {
    private int armor = 50;

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void takeDamage(int dmg) {
        super.takeDamage(Math.max(0, dmg - armor / 10));
    }
}