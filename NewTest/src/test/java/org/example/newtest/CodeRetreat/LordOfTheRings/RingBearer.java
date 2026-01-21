package org.example.newtest.CodeRetreat.LordOfTheRings;

import java.util.Objects;

abstract class RingBearer {
    protected final String name;
    protected boolean hasRing = false;

    public RingBearer(String name) {
        this.name = name;
    }

    public abstract void speak();

    public abstract void putOnRing() throws RingTakenException;

    public void removeRing() {
        if (hasRing) {
            hasRing = false;
            System.out.println(name + " снимает Кольцо...");
        }
    }

    public boolean hasRing() {
        return hasRing;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RingBearer)) return false;
        return name.equals(((RingBearer) o).name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name + (hasRing ? "(носит Кольцо)" : "");
    }
}